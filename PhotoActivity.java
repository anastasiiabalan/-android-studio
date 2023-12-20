package com.example.bigtripbalan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhotoActivity extends AppCompatActivity {
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    Button bt11;
    Button bt12;
    Button bt13;
    Button bt14;
    Button bt15;
    Button bt16;
    Button bt17;
    Button bt18;

    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;

    TextView tw16;
    TextView tw17;


    boolean f1;
    boolean f2;
    boolean f3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt10 = (Button) findViewById(R.id.bt10);
        bt11 = (Button) findViewById(R.id.bt11);
        bt12 = (Button) findViewById(R.id.bt12);
        bt13 = (Button) findViewById(R.id.bt13);
        bt14 = (Button) findViewById(R.id.bt14);
        bt15= (Button) findViewById(R.id.bt15);
        bt16= (Button) findViewById(R.id.bt16);
        bt17= (Button) findViewById(R.id.bt17);
        bt18= (Button) findViewById(R.id.bt18);
        bt7 = (Button) findViewById(R.id.bt7);

        tw16= (TextView) findViewById(R.id.tw16);
        tw17 = (TextView) findViewById(R.id.tw17);

        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        l3 = (LinearLayout) findViewById(R.id.l3);

        Bundle arguments=getIntent().getExtras();
        String rez=arguments.get("city").toString();

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhotoActivity.this, GolovnActivity.class);
                startActivity(intent);
            }
        });

        if (rez.equals("3")) {
            tw16.setText("Італії");
            //Ital
            bt9.setBackgroundColor(Color.GREEN);
            bt12.setBackgroundColor(Color.GREEN);
            bt15.setBackgroundColor(Color.GREEN);

            bt10.setBackgroundColor(Color.WHITE);
            bt13.setBackgroundColor(Color.WHITE);
            bt16.setBackgroundColor(Color.WHITE);

            bt11.setBackgroundColor(Color.RED);
            bt14.setBackgroundColor(Color.RED);
            bt17.setBackgroundColor(Color.RED);




             tw17.setText("*прапор має бути перевернутим");
            bt9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.GREEN);
                    f1 = true;
                    bt10.setEnabled(false);
                    bt11.setEnabled(false);

                }
            });


            bt10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt11.setEnabled(false);
                    bt9.setEnabled(false);
                    l1.setBackgroundColor(Color.WHITE);
                    f1 = false;
                }
            });


            bt11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt10.setEnabled(false);
                    bt9.setEnabled(false);
                    l1.setBackgroundColor(Color.RED);
                    f1 = false;


                }
            });


////,,
            bt12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.GREEN);
                    f2 = false;

                }
            });

            bt13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt12.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.WHITE);
                    f2 = true;
                }
            });

            bt14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt12.setEnabled(false);
                    l2.setBackgroundColor(Color.RED);
                    f2 = false;
                }
            });

////

            bt15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt17.setEnabled(false);
                    bt16.setEnabled(false);
                    l3.setBackgroundColor(Color.GREEN);
                    f2 = false;
                }
            });

            bt16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt15.setEnabled(false);
                    bt17.setEnabled(false);
                    l3.setBackgroundColor(Color.WHITE);
                    f2 = false;
                }
            });

            bt17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt16.setEnabled(false);
                    bt15.setEnabled(false);
                    l3.setBackgroundColor(Color.RED);
                    f3 = true;
                }
            });


            ///////

            bt7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (f1 == true & f2 == true & f3 == true) {
                        bt7.setText("Молодець");
                    } else {
                        bt7.setText("Спробуй ще раз");
                    }


                }
            });

            bt18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.GRAY);
                    l2.setBackgroundColor(Color.GRAY);
                    l3.setBackgroundColor(Color.GRAY);

                    bt8.setEnabled(true);
                    bt9.setEnabled(true);
                    bt10.setEnabled(true);
                    bt11.setEnabled(true);
                    bt12.setEnabled(true);
                    bt13.setEnabled(true);

                    bt14.setEnabled(true);
                    bt15.setEnabled(true);
                    bt16.setEnabled(true);
                    bt17.setEnabled(true);
                    bt18.setEnabled(true);

                    bt7.setText("Перевірка");
                }
            });
        }else if (rez.equals("1")) {
            tw16.setText("Іспанії");
            bt9.setBackgroundColor(Color.RED);
            bt12.setBackgroundColor(Color.RED);
            bt15.setBackgroundColor(Color.RED);

            bt10.setBackgroundColor(Color.YELLOW);
            bt13.setBackgroundColor(Color.YELLOW);
            bt16.setBackgroundColor(Color.YELLOW);

            bt11.setBackgroundColor(Color.RED);
            bt14.setBackgroundColor(Color.RED);
            bt17.setBackgroundColor(Color.RED);

            //Ispan
            bt9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.RED);
                    f1 = true;
                    bt10.setEnabled(false);
                    bt11.setEnabled(false);

                }
            });


            bt10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt9.setEnabled(false);
                    bt11.setEnabled(false);
                    l1.setBackgroundColor(Color.YELLOW);
                    f1 = false;
                }
            });


            bt11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt10.setEnabled(false);
                    bt9.setEnabled(false);
                    l1.setBackgroundColor(Color.RED);
                    f1 = true;


                }
            });


////,,
            bt12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.RED);
                    f2 = false;

                }
            });

            bt13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt12.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.YELLOW);
                    f2 = true;
                }
            });

            bt14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt12.setEnabled(false);
                    l2.setBackgroundColor(Color.RED);
                    f2 = false;
                }
            });

////

            bt15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt17.setEnabled(false);
                    bt16.setEnabled(false);
                    l3.setBackgroundColor(Color.RED);
                    f2 = true;
                }
            });

            bt16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt15.setEnabled(false);
                    bt17.setEnabled(false);
                    l3.setBackgroundColor(Color.YELLOW);
                    f2 = false;
                }
            });

            bt17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt15.setEnabled(false);
                    bt16.setEnabled(false);
                    l3.setBackgroundColor(Color.RED);
                    f3 = true;
                }
            });


            ///////

            bt7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (f1 == true & f2 == true & f3 == true) {
                        bt7.setText("Молодець");
                    } else {
                        bt7.setText("Спробуй ще раз");
                    }


                }
            });

            bt18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.GRAY);
                    l2.setBackgroundColor(Color.GRAY);
                    l3.setBackgroundColor(Color.GRAY);

                    bt8.setEnabled(true);
                    bt9.setEnabled(true);
                    bt10.setEnabled(true);
                    bt11.setEnabled(true);
                    bt12.setEnabled(true);
                    bt13.setEnabled(true);

                    bt14.setEnabled(true);
                    bt15.setEnabled(true);
                    bt16.setEnabled(true);
                    bt17.setEnabled(true);
                    bt18.setEnabled(true);

                    bt7.setText("Перевірка");
                }
            });
        } else if (rez.equals("2")) {
            tw16.setText("Амстердаму");

            bt9.setBackgroundColor(Color.RED);
            bt12.setBackgroundColor(Color.RED);
            bt15.setBackgroundColor(Color.RED);

            bt10.setBackgroundColor(Color.WHITE);
            bt13.setBackgroundColor(Color.WHITE);
            bt16.setBackgroundColor(Color.WHITE);

            bt11.setBackgroundColor(Color.BLUE);
            bt14.setBackgroundColor(Color.BLUE);
            bt17.setBackgroundColor(Color.BLUE);

            //Niderl
            bt9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.RED);
                    f1 = true;
                    bt10.setEnabled(false);
                    bt11.setEnabled(false);

                }
            });


            bt10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt11.setEnabled(false);
                    bt9.setEnabled(false);
                    l1.setBackgroundColor(Color.WHITE);
                    f1 = false;
                }
            });


            bt11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt10.setEnabled(false);
                    bt9.setEnabled(false);
                    l1.setBackgroundColor(Color.BLUE);
                    f1 = false;


                }
            });


////,,
            bt12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.RED);
                    f2 = false;

                }
            });

            bt13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt12.setEnabled(false);
                    bt14.setEnabled(false);
                    l2.setBackgroundColor(Color.WHITE);
                    f2 = true;
                }
            });

            bt14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt13.setEnabled(false);
                    bt12.setEnabled(false);
                    l2.setBackgroundColor(Color.BLUE);
                    f2 = false;
                }
            });

////

            bt15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt17.setEnabled(false);
                    bt16.setEnabled(false);
                    l3.setBackgroundColor(Color.RED);
                    f2 = false;
                }
            });

            bt16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt15.setEnabled(false);
                    bt17.setEnabled(false);
                    l3.setBackgroundColor(Color.WHITE);
                    f2 = false;
                }
            });

            bt17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bt16.setEnabled(false);
                    bt15.setEnabled(false);
                    l3.setBackgroundColor(Color.BLUE);
                    f3 = true;
                }
            });


            ///////

            bt7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (f1 == true & f2 == true & f3 == true) {
                        bt7.setText("Молодець");
                    } else {
                        bt7.setText("Спробуй ще раз");
                    }


                }
            });

            bt18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    l1.setBackgroundColor(Color.GRAY);
                    l2.setBackgroundColor(Color.GRAY);
                    l3.setBackgroundColor(Color.GRAY);

                    bt8.setEnabled(true);
                    bt9.setEnabled(true);
                    bt10.setEnabled(true);
                    bt11.setEnabled(true);
                    bt12.setEnabled(true);
                    bt13.setEnabled(true);

                    bt14.setEnabled(true);
                    bt15.setEnabled(true);
                    bt16.setEnabled(true);
                    bt17.setEnabled(true);
                    bt18.setEnabled(true);

                    bt7.setText("Перевірка");
                }
            });


        }
    }
}
