package com.smartalarm.alarm;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private TimePicker alarmTimePicker;
    SharedPreferences sharedPref;

    Calendar calendar;
    private TextView  puzzle_text, date_text, mRepeatText, mRepeatNoText, mRepeatTypeText;
    private static MainActivity inst;
    private TextView alarmTextView;
    private int mYear, mMonth,  mDay;
    public  long mRepeatTime;
    private Switch mRepeatSwitch;
    private String mDate;
    private String mRepeat;
    private String mRepeatNo;
    private String mRepeatType;
    public   boolean status = true;
    Ringtone ringTone;

    // Constant values in milliseconds
    private static final long milMinute = 60000L;
    private static final long milHour = 3600000L;
    private static final long milDay = 86400000L;
    private static final long milWeek = 604800000L;
    private static final long milMonth = 2592000000L;
    public static MainActivity instance() {
        return inst;
    }

    @Override
    public void onStart() {
        super.onStart();
        inst = this;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePicker);
        alarmTextView = (TextView) findViewById(R.id.alarmText);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        date_text=(TextView) findViewById(R.id.set_date);
        mRepeatText = (TextView) findViewById(R.id.set_repeat);
        mRepeatNoText = (TextView) findViewById(R.id.set_repeat_no);
        mRepeatTypeText = (TextView) findViewById(R.id.set_repeat_type);
        mRepeatSwitch = (Switch) findViewById(R.id.repeat_switch);
        puzzle_text = (TextView) findViewById(R.id.puzzle_text);

//        Intent intent = getIntent();
//        intent.getData();
        //mActive = "true";
        mRepeat = "true";
        mRepeatNo = Integer.toString(1);
        mRepeatType = "Hour";

        calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH) + 1;
        mDay = calendar.get(Calendar.DATE);

        mDate = mDay + "/" + mMonth + "/" + mYear;

        // Setup TextViews using reminder values
         date_text.setText(mDate);
          mRepeatNoText.setText(mRepeatNo);
        mRepeatTypeText.setText(mRepeatType);
          mRepeatText.setText("Every " + mRepeatNo + " " + mRepeatType + "(s)");

        puzzle_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Select_Puzzle.class);

                startActivity(intent1);
            }
        });


        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater manuinflater = getMenuInflater();
        manuinflater.inflate(R.menu.all_menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        int id = item.getItemId();
        if (id == R.id.itm4){
            Log.d("MyActivity", "Alarm On");
           // calendar = Calendar.getInstance();
            calendar.set(Calendar.MONTH, --mMonth);
            calendar.set(Calendar.YEAR, mYear);
            calendar.set(Calendar.DAY_OF_MONTH, mDay);
            calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
            calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
            Intent myIntent = new Intent(MainActivity.this, AlarmReceiver.class);
            pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent, 0);
            alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);


        }
        else if(id == R.id.itm5) {
            Intent myIntent = new Intent(MainActivity.this, AlarmReceiver.class);
            pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent, 0);
            status = false;
            Toast.makeText(getApplicationContext(), " Alarm off", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }


    public void setAlarmText(String alarmText) {
        alarmTextView.setText(alarmText);
    }


    // On clicking the repeat switch
    public void onSwitchRepeat(View view) {
        boolean on = ((Switch) view).isChecked();
        if (on) {
            mRepeat = "true";
            mRepeatText.setText("Every " + mRepeatNo + " " + mRepeatType + "(s)");
        } else {
            mRepeat = "false";
            mRepeatText.setText(R.string.repeat_off);
        }
    }

    // On clicking repeat type button
    public void selectRepeatType(View v){
        final String[] items = new String[5];

        items[0] = "Minute";
        items[1] = "Hour";
        items[2] = "Day";
        items[3] = "Week";
        items[4] = "Month";

        // Create List Dialog
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Select Type");
        builder.setItems(items, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                mRepeatType = items[item];
                mRepeatTypeText.setText(mRepeatType);
             mRepeatText.setText("Every " + mRepeatNo + " " + mRepeatType + "(s)");
            }
        });
        android.app.AlertDialog alert = builder.create();
        alert.show();
    }

    /////////----------Repeatation -------------

    public void setRepeatNo(View v){
        android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(this);
        alert.setTitle("Enter Number");

        // Create EditText box to input repeat number
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);
        alert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

//                        if (input.getText().toString().length() == 0) {
//                            mRepeatNo = Integer.toString(1);
//                            mRepeatNoText.setText(mRepeatNo);
//                            mRepeatText.setText("Every " + mRepeatNo + "(s)");
//                        }
//                        else {
//                            mRepeatNo = input.getText().toString().trim();
//                            mRepeatNoText.setText(mRepeatNo);
//                            mRepeatText.setText("Every " + mRepeatNo +  "(s)");
//                        }

                        if(input.getText().toString().length() == 0) {
                        mRepeatNo = "1";
                            mRepeatNoText.setText(mRepeatNo);
                            mRepeatText.setText("Every " + mRepeatNo + "(s)");
                        }else{
                            mRepeatNo = input.getText().toString().trim();
                           mRepeatNoText.setText(mRepeatNo);
                            mRepeatText.setText("Every " + mRepeatNo +  "(s)");
                        }



                    }

                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // do nothing
            }
        });
        alert.show();
    }
public  void setDate(View v){
    Calendar now = Calendar.getInstance();
    mYear=now.get(Calendar.YEAR);
    mMonth=now.get(Calendar.MONTH);
    mDay=now.get(Calendar.DAY_OF_MONTH);
    DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this,MainActivity.this,mYear,mMonth,mDay);
    datePickerDialog.show();

}
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        monthOfYear ++;
        mDay = dayOfMonth;
        mMonth = monthOfYear;
        mYear = year;
        mDate = dayOfMonth + "/" + monthOfYear + "/" + year;
        date_text.setText(mDate);
    }
}
