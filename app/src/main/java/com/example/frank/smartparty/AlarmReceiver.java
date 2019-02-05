package com.example.frank.smartparty;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.util.Calendar;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by Frank on 2017/2/5.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferences=context.getSharedPreferences("alarm_record", Activity.MODE_PRIVATE);
        String hour=String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        String minute=String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
        String time=sharedPreferences.getString(hour+":"+minute,null);
        if (time!=null){
            MediaPlayer mediaPlayer= MediaPlayer.create(context,R.raw.vv);
            mediaPlayer.start();
        }
    }
}
