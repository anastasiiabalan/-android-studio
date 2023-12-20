package com.example.bigtripbalan;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class GolovnActivity  extends AppCompatActivity {
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    int city;
    TextView tw11;
    ImageView im1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golovn);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);

        menu.setIcon(R.drawable.ic_action_time_to_leave);

        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        im1=(ImageView)findViewById(R.id.im1);
        tw11=(TextView)findViewById(R.id.tw11);

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GolovnActivity.this, ZinaActivity.class);
                startActivity(intent);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GolovnActivity.this, BagazActivity.class);
                startActivity(intent);

            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GolovnActivity.this, PhotoActivity.class);
                startActivity(intent);

                Intent intent1=new Intent(GolovnActivity.this,PhotoActivity.class);
                intent1.putExtra("city",city);
                startActivity(intent1);



            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GolovnActivity.this, TurActivity.class);
                startActivity(intent);
                Intent intent1=new Intent(GolovnActivity.this,TurActivity.class);
                intent1.putExtra("city",city);
                startActivity(intent1);



            }
        });
        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GolovnActivity.this, InfActivity.class);
                startActivity(intent);


                Intent intent1=new Intent(GolovnActivity.this,InfActivity.class);
                intent1.putExtra("city",city);
                startActivity(intent1);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.rum:
                city=3;
                tw11.setText("Рим");
                im1.setImageDrawable(getResources().getDrawable(R.drawable.rum));
                break;
            case R.id.madr:
                city=1;
                tw11.setText("Мадрид");
                im1.setImageDrawable(getResources().getDrawable(R.drawable.madr));

                break;

            case R.id.amst:
                city=2;
                tw11.setText("Амстердам");
                im1.setImageDrawable(getResources().getDrawable(R.drawable.nide));
                break;


        }
        return super.onOptionsItemSelected(item);
    }

}
