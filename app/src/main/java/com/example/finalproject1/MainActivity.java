package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    Button btn_calculator,btn_siteView,btn_dialogView,btn_mediaPlayer,btn_listView,btn_gridView,btn_close;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calculator = findViewById(R.id.btn_calculator);
        btn_siteView = findViewById(R.id.btn_siteView);
        btn_dialogView = findViewById(R.id.btn_dialog);
        btn_mediaPlayer = findViewById(R.id.btn_mediaPlayer);
        btn_listView = findViewById(R.id.btn_listView);
        btn_gridView = findViewById(R.id.btn_gridView);



        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(getApplicationContext(),CalculatorActivity.class);
                startActivity(intent);
            }
        });

        btn_siteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(getApplicationContext(),SiteviewActivity.class);
                startActivity(intent);
            }
        });

        btn_dialogView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //تعریف شی دیالوگ
                final Dialog dialog= new Dialog(MainActivity.this);
                //اتصال به لایه xml
                dialog.setContentView(R.layout.dialog_layout);
                //تعریف و اتصال به فایل xml کلید بستن دیالوگ
                btn_close = dialog.findViewById(R.id.btn_close);
                //نمایش دیالوگ
                dialog.show();

                //تعریف کلید بستن دیالوگ
                btn_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                    }
                });

            }
        });

        btn_mediaPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(getApplicationContext(),MediaplayerActivity.class);
                startActivity(intent);
            }
        });

        btn_listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(getApplicationContext(),ListviewActivity.class);
                startActivity(intent);
            }
        });

        btn_gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(getApplicationContext(),GridviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
