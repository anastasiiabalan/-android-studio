package com.example.bigtripbalan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfActivity extends AppCompatActivity {
    TextView tw23;
    TextView tw22;
    TextView tw21;
    TextView tw20;
    TextView tw19;
    ImageView im3;
    ImageView im4;
    ImageView im5;
    ImageView im6;
    Button bt19;

    String rez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);
        tw20=(TextView)findViewById(R.id.tw20);
        tw21=(TextView)findViewById(R.id.tw21);
        tw22=(TextView)findViewById(R.id.tw22);
        tw23=(TextView)findViewById(R.id.tw23);
        tw19=(TextView)findViewById(R.id.tw19);
        im3=(ImageView)findViewById(R.id.im3);
        im5=(ImageView)findViewById(R.id.im5);
        im4=(ImageView)findViewById(R.id.im4);
        im6=(ImageView)findViewById(R.id.im6);
        bt19=(Button)findViewById(R.id.bt19) ;

        Bundle arguments=getIntent().getExtras();
        String rez=arguments.get("city").toString();




        if(rez.equals("1")){
            tw19.setText("Мадрид");
            tw20.setText("Мадрид знаходиться точно в центрі Іспанії, і є її столицею");
            tw21.setText("У Мадриді щорічно проводиться чемпіонат з сієсти, учасники якого повинні заснути серед шуму натовпу, що зібрався");
            tw22.setText("У Мадриді немає всесвітньо відомих пам’яток, проте тут є один з найбільших аквапарків у Європі! На його території розташувалися п’ять гігантських водних гірок, басейни і навіть джакузі");
            tw23.setText("Для любителів тварин це місто є просто ідеальним. Тут працює один з кращих зоопарків Іспанії, який може похвалитися чотирма гігантськими китайськими пандами, австралійськими коалами і безліччю видів тварин та рослин. Також тут розташований парк сафарі, де ви зможете подивитися, як живуть леви, мавпи, зебри...");
            im3.setImageResource(R.drawable.m1);
            im4.setImageResource(R.drawable.m2);
            im5.setImageResource(R.drawable.m3);
            im6.setImageResource(R.drawable.m4);


        }else if(rez.equals("3")){
            tw19.setText("Рим");
            tw20.setText("Рим не завжди був столицею Італії, а став нею 149 років тому");
            tw21.setText("Музей макаронних виробів — туристична новинка сучасного Риму. Тут експонують різноманітні види пасти, зразки якої займають аж 11 залів");
            tw22.setText("Дві тисячі фонтанів — саме стільки штучних джерел прикрашають Рим. Чверть із них — це вражаючі монументальні композиції, у яких заведено залишати монетки на згадку");
            tw23.setText("У новенького свіжозбудованого Колізею був дах. І взагалі ця будівля настільки продумана, що 70 тисяч глядачів (а саме стільки вміщав Колізей) могли покинути арену за 3 хвилини!");
            im3.setImageResource(R.drawable.r1);
            im4.setImageResource(R.drawable.r2);
            im5.setImageResource(R.drawable.r3);
            im6.setImageResource(R.drawable.r4);

        }else if(rez.equals("2")){
            tw19.setText("Амстердам");
            tw20.setText("Амстердам називають Північною Венецією, тому що в ньому налічується більше 150 каналів і 1200 мостів");
            tw21.setText("В місті багато «плавучих будинків» (вікенд-Хоумс), тобто будинки, в які їх господарі приїжджають на вихідні або на свята");
            tw22.setText("На одній з вулиць Амстердаму знаходиться один з найвужчих будинків в світі його ширина вимірюється одними лише вхідними дверми");
            tw23.setText("Старі будинки збудовані під нахилом вперед, до вулиці і до каналу. Чому так? Для того, щоб було тягнути вантажі, а на самому верху будинку висів здоровенний гак з лебідкою");
            im3.setImageResource(R.drawable.a1);
            im4.setImageResource(R.drawable.a2);
            im5.setImageResource(R.drawable.a3);
            im6.setImageResource(R.drawable.a4);
        }

        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfActivity.this, GolovnActivity.class);
                startActivity(intent);




            }
        });







    }

}
