package com.example.frank.smartparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainHome extends AppCompatActivity {

    Button life,party,me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        life=(Button) findViewById(R.id.button28);
        party=(Button) findViewById(R.id.button26);
        me=(Button) findViewById(R.id.button27);




        life.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainHome.this,MainHome.class);
                startActivity(intent);
                finish();

            }
        });

        party.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainHome.this,ActivitySpace.class);
                startActivity(intent);
                finish();

            }
        });
        me.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainHome.this,MyInformation.class);
                startActivity(intent);
                finish();

            }
        });




    }
}
