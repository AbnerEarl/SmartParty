package com.example.frank.smartparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyInformation extends AppCompatActivity {


    Button life,party,me;
    Button receiveparty,holdparty,futureparty,historyparty,personinfomation,personsetting,extraadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_information);

        receiveparty=(Button)findViewById(R.id.button9);
        holdparty=(Button)findViewById(R.id.button11);
        futureparty=(Button)findViewById(R.id.button13);
        historyparty=(Button)findViewById(R.id.button14);
        personinfomation=(Button)findViewById(R.id.button10);
        personsetting=(Button)findViewById(R.id.button12);
        extraadd=(Button) this.findViewById(R.id.button33);



        life=(Button) findViewById(R.id.button25);
        party=(Button) findViewById(R.id.button23);
        me=(Button) findViewById(R.id.button24);


        life.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,MainHome.class);
                startActivity(intent);
                finish();

            }
        });

        party.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,ActivitySpace.class);
                startActivity(intent);
                finish();

            }
        });
        me.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,MyInformation.class);
                startActivity(intent);
                finish();

            }
        });



        receiveparty.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,ReceiveParty.class);
                startActivity(intent);

            }
        });


        holdparty.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,HoldParty.class);
                startActivity(intent);

            }
        });

        futureparty.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,FutureParty.class);
                startActivity(intent);

            }
        });

        historyparty.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,HistoryParty.class);
                startActivity(intent);

            }
        });

        personinfomation.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,PersonInfomation.class);
                startActivity(intent);

            }
        });

        personsetting.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,PersonSetting.class);
                startActivity(intent);

            }
        });



        extraadd.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MyInformation.this,ExtraAdd.class);
                startActivity(intent);

            }
        });








    }
}
