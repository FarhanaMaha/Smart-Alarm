package com.smartalarm.alarm;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by MAHA on 9/10/2018.
 */

public class AlarmService extends IntentService {
    public NotificationManager alarmNotificationManager;
    public AlarmService() {
        super("AlarmService");
    }
   SharedPreferences sharedPreferences;
    Intent intent;
    SharedPreferences.Editor editor;
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        sendNotification("Wake Up! Wake Up!");
    }
    private void sendNotification(String msg) {
       // Equation_solve ins = new Equation_solve();
        Log.d("AlarmService", "Preparing to send notification...: " + msg);
        alarmNotificationManager = (NotificationManager) this
                .getSystemService(Context.NOTIFICATION_SERVICE);

        sharedPreferences=getSharedPreferences("puzzle type", Context.MODE_PRIVATE);

        String type=sharedPreferences.getString("types","");


        if (type=="equation"){
             intent =  new Intent(AlarmService.this,Equation_solve.class);
            intent.putExtra("EQUATION","equation");
            //Toast.makeText(getApplicationContext(),  "get EQUATION " + type +"", Toast.LENGTH_SHORT).show();
        }else if (type=="memorization"){
             intent =  new Intent(AlarmService.this,Memory_Solve.class);
            intent.putExtra("MEMORIZATION","memorization");
            //Toast.makeText(getApplicationContext(),  " get Memory " + type +"", Toast.LENGTH_SHORT).show();
        }
        else {
            intent =  new Intent(AlarmService.this,AlarmService.class);
        }

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,intent
               , 0);


      String channelID="channelID";
        NotificationCompat.Builder alamNotificationBuilder = new NotificationCompat.Builder(
            this,channelID).setContentTitle("Alarm").setSmallIcon(R.drawable.ic_notifications_on_white_24dp)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(msg))
            .setContentText(msg);


        alamNotificationBuilder.setContentIntent(contentIntent);
        alarmNotificationManager.notify(1, alamNotificationBuilder.build());
        Log.d("AlarmService", "Notification sent.");
}
}
