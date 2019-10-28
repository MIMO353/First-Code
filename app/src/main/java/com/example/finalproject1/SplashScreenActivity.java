package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        //تعریف هندلر اسپلش اسکرین
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //تعریف فضای اشتراکی
                final SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(SplashScreenActivity.this);

                try {

                    // بررسی ورود نخست یا ورود برای بار دیگر

                    if (spf.getBoolean("loginCheck",false)==true)
                    {
                        //رفتن به اکتیویتی اصلی
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                        //خاتمه صفحه
                    }

                    else
                    {
                        //رفتن به اکتیویتی ورود
                        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(intent);
                        finish();
                        //خاتمه صفحه
                    }
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }


            }
        },3000);



    }
}
