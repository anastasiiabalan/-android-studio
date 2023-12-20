package com.example.bigtripbalan;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BagazActivity extends AppCompatActivity {
    CheckBox q1;
    CheckBox q2;
    CheckBox q3;
    CheckBox q4;
    CheckBox q5;
    CheckBox q6;
    CheckBox q7;
    CheckBox q8;
    CheckBox q9;
    CheckBox q10;
    CheckBox q11;
    TextView tw12;
    Button bt24;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagaz);
        q1=(CheckBox)findViewById(R.id.checkBox);
        q2=(CheckBox)findViewById(R.id.checkBox2);
        q3=(CheckBox)findViewById(R.id.checkBox3);
        q4=(CheckBox)findViewById(R.id.checkBox4);
        q5=(CheckBox)findViewById(R.id.checkBox5);
        q6=(CheckBox)findViewById(R.id.checkBox6);
        q7=(CheckBox)findViewById(R.id.checkBox7);
        q8=(CheckBox)findViewById(R.id.checkBox8);
        q9=(CheckBox)findViewById(R.id.checkBox9);
        q10=(CheckBox)findViewById(R.id.checkBox10);
        q11=(CheckBox)findViewById(R.id.checkBox11);
        bt24=(Button) findViewById(R.id.bt24);
        tw12=(TextView) findViewById(R.id.tw12);

        Typeface halloween_font = Typeface.createFromAsset(getAssets(),"fonts/HERTINA.ttf");
        tw12.setTypeface(halloween_font);

        bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BagazActivity.this, GolovnActivity.class);
                startActivity(intent);
            }
        });



    }

    public void onCheckedChange(View view) {
        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox:
                if(checked){
                    q1.setEnabled(false);
                    q2.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox2:
                if(checked){
                    q2.setEnabled(false);
                    q3.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.checkBox3:
                if(checked){
                    q3.setEnabled(false);
                    q4.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox4:
                if(checked){
                    q4.setEnabled(false);
                    q5.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox5:
                if(checked){
                    q5.setEnabled(false);
                    q6.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.checkBox6:
                if(checked){
                    q6.setEnabled(false);
                    q7.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox7:
                if(checked){
                    q7.setEnabled(false);
                    q8.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.checkBox8:
                if(checked){
                    q8.setEnabled(false);
                    q9.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox9:
                if(checked){
                    q9.setEnabled(false);
                    q10.setVisibility(View.VISIBLE);

                }
                break;

            case R.id.checkBox10:
                if(checked){
                    q10.setEnabled(false);
                    q11.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.checkBox11:
                if(checked){
                    q11.setEnabled(false);
                    tw12.setVisibility(View.VISIBLE);
                }
                break;


        }
    }
}
