package com.example.bigtripbalan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ZinaActivity extends AppCompatActivity {
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton10;
    RadioButton radioButton11;
    RadioButton radioButton12;
    RadioButton radioButton13;
    RadioButton radioButton14;
    Button bt20;
    Button bt21;
    Button bt25;
    TextView tw24;



    int den;
    int zr;
    int lud;
    int eks;
    int tr;
    int zagzin;

    int den2;

    int zden;
    int trans2;
    int eksk2;
    int lud2;





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zina);
        radioButton=(RadioButton)findViewById(R.id.radioButton) ;
        radioButton2=(RadioButton) findViewById(R.id.radioButton2);
        radioButton3=(RadioButton)findViewById(R.id.radioButton3);
        radioButton4 =(RadioButton) findViewById(R.id.radioButton4);
        radioButton5=(RadioButton)findViewById(R.id.radioButton5);
        radioButton6=(RadioButton) findViewById(R.id.radioButton6);
        radioButton7 =(RadioButton)findViewById(R.id.radioButton7);
        radioButton8=(RadioButton) findViewById(R.id.radioButton8);
        radioButton9 =(RadioButton)findViewById(R.id.radioButton9);
        radioButton10=(RadioButton) findViewById(R.id.radioButton10);
        radioButton11=(RadioButton)findViewById(R.id.radioButton11);
        radioButton12=(RadioButton)findViewById(R.id.radioButton12) ;
        radioButton13=(RadioButton)findViewById(R.id.radioButton13);
        radioButton14 =(RadioButton) findViewById(R.id.radioButton14);

        bt20=(Button) findViewById(R.id.bt20);
        bt21=(Button) findViewById(R.id.bt21);
        bt25=(Button) findViewById(R.id.bt25);

        tw24=(TextView)findViewById(R.id.tw24);




        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZinaActivity.this, GolovnActivity.class);
                startActivity(intent);

            }
        });


        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(den==4){
                    den2=4;
                }else if(den==5){
                    den2=5;
                } else  if(den==6){
                    den2=6;

                }

                if(zr==2){
                    zden=den2*25;
                } else if(zr==3){
                    zden=den2*35;
                }else if(zr==4){
                    zden=den2*50;
                }

                if(tr==1){
                   trans2=150;
                }else if(tr==2){
                    trans2=200;
                }

                if(eks==4){
                    eksk2=80;
                } else if(eks==5){
                    eksk2=100;
                }else if(eks==6){
                    eksk2=120;
                }
                if(lud==2){
                    lud2=2;
                } else if(lud==3){
                    lud2=3;
                }else if(lud==6){
                    lud2=6;
                }

                zagzin=(zden+trans2+eksk2)*lud2;

                tw24.setText("   "+ zagzin+" Є");

            }
        });

        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
                radioButton6.setEnabled(true);
                radioButton7.setEnabled(true);
                radioButton8.setEnabled(true);
                radioButton9.setEnabled(true);
                radioButton10.setEnabled(true);
                radioButton11.setEnabled(true);
                radioButton12.setEnabled(true);
                radioButton13.setEnabled(true);
                radioButton14.setEnabled(true);
                zagzin=0;
                den=0;
                zr=0;
                tr=0;
                eks=0;
                lud=0;
                 zden=0;
                 trans2=0;
                 eksk2=0;
                 lud2=0;

             }
        });
    }

    public void onClickChacked(View view) {
        switch (view.getId()) {
            case R.id.radioButton:
                den = 4;
              //  zagzin=den;
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);

                break;

            case R.id.radioButton2:
                den = 5;
              //  zagzin=den;
                radioButton.setEnabled(false);
                radioButton3.setEnabled(false);
                break;

            case R.id.radioButton3:
                den = 6;
                //zagzin=den;
                radioButton.setEnabled(false);
                radioButton2.setEnabled(false);
                break;
        }
    }


    public void onClickChacked2(View view) {
        switch (view.getId()) {
            case R.id.radioButton4:
                zr = 2;
               // zagzin=zagzin*25;
                radioButton5.setEnabled(false);
                radioButton6.setEnabled(false);

                break;

            case R.id.radioButton5:
                zr = 3;
               // zagzin=zagzin*35;
                radioButton4.setEnabled(false);
                radioButton6.setEnabled(false);

                break;

            case R.id.radioButton6:
                zr = 4;
               // zagzin=zagzin*50;
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);

                break;
        }

    }

    public void onClickChacked3(View view) {
        switch (view.getId()) {
            case R.id.radioButton7:
             //   tr = 1;
                zagzin=zagzin+150;
                radioButton8.setEnabled(false);


                break;

            case R.id.radioButton8:
                tr = 2;
            //    zagzin=zagzin+200;
                radioButton7.setEnabled(false);
                break;


        }

    }

    public void onClickChacked4(View view) {
        switch (view.getId()) {
            case R.id.radioButton9:
                eks = 4;
              //  zagzin=zagzin+eks*20;
                radioButton10.setEnabled(false);
                radioButton11.setEnabled(false);

                break;

            case R.id.radioButton10:
                eks = 5;
              //  zagzin=zagzin+eks*20;
                radioButton9.setEnabled(false);
                radioButton11.setEnabled(false);
                break;

            case R.id.radioButton11:
                eks = 6;
               // zagzin=zagzin+eks*20;
                radioButton9.setEnabled(false);
                radioButton10.setEnabled(false);
                break;
        }
        eks=0;
    }

    public void onClickChacked5(View view) {
        switch (view.getId()) {
            case R.id.radioButton12:
                lud = 2;
              //  zagzin=zagzin*lud;
                radioButton13.setEnabled(false);
                radioButton14.setEnabled(false);

                break;

            case R.id.radioButton13:
                lud = 3;
               // zagzin=zagzin*lud;
                radioButton12.setEnabled(false);
                radioButton14.setEnabled(false);

                break;

            case R.id.radioButton14:
                lud = 4;
               // zagzin=zagzin*lud;
                radioButton12.setEnabled(false);
                radioButton13.setEnabled(false);

                break;
        }

    }

}
