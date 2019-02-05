package com.example.frank.smartparty;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class FutureParty extends AppCompatActivity implements OnClickListener {

    private TextView tv;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_party);

        tv=(TextView) findViewById(R.id.textView15);
        Button bb=(Button) findViewById(R.id.button40);
        bb.setOnClickListener(this);

        sharedPreferences=getSharedPreferences("alarm_record", Activity.MODE_PRIVATE);

        AlarmManager alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);

        Intent intent=new Intent(FutureParty.this,AlarmReceiver.class);
        PendingIntent pendingIntent=PendingIntent.getBroadcast(this,0,intent,0);
        alarmManager.setRepeating(AlarmManager.RTC,0,60*1000,pendingIntent);
    }

    @Override
    public void onClick(View v) {
        View view=getLayoutInflater().inflate(R.layout.activity_future_party,null);
        final TimePicker timePicker=(TimePicker)view.findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
        new AlertDialog.Builder(this).setTitle("设置提醒时间").setView(view).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String timestr=String.valueOf(timePicker.getCurrentHour())+":"+String.valueOf(timePicker.getCurrentMinute());
                tv.setText(tv.getText()+"\n"+timestr);
                sharedPreferences.edit().putString(timestr,timestr).commit();
            }
        }).setNegativeButton("取消",null).show();
    }
}
