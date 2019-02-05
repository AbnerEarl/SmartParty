package com.example.frank.smartparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySpace extends AppCompatActivity {
    Button myfriends,createspace,aroundscence,makeinvite,mutilchat;
    Button life,party,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);



        myfriends=(Button) findViewById(R.id.button15);
        createspace=(Button) findViewById(R.id.button16);
        aroundscence=(Button) findViewById(R.id.button17);
        makeinvite=(Button) findViewById(R.id.button18);
        mutilchat=(Button) findViewById(R.id.button19);


        life=(Button) findViewById(R.id.button20);
        party=(Button) findViewById(R.id.button21);
        me=(Button) findViewById(R.id.button22);


        life.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,MainHome.class);
                startActivity(intent);
                finish();

            }
        });

        party.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,ActivitySpace.class);
                startActivity(intent);
                finish();

            }
        });
        me.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,MyInformation.class);
                startActivity(intent);
                finish();

            }
        });





        myfriends.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,MyFriends.class);
                startActivity(intent);

            }
        });

        createspace.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,CreateSpace.class);
                startActivity(intent);

            }
        });

        aroundscence.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivitySpace.this, ApplicationLoad.class);
                intent.putExtra("url", "http://map.baidu.com/mobile/webapp/search/search/foo=bar&qt=s&wd=%E6%99%AF%E7%82%B9&c=373&searchFlag=sort&center_rank=1&nb_x=12194251.38&nb_y=3491489.7&da_src=indexnearbypg.nearby/center_name=%E6%88%91%E7%9A%84%E4%BD%8D%E7%BD%AE");
                startActivity(intent);

            }
        });

        makeinvite.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,Home.class);
                startActivity(intent);

            }
        });

        mutilchat.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivitySpace.this,SmartChat.class);
                startActivity(intent);

            }
        });


    }
}
