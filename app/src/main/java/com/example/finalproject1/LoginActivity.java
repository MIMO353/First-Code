package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LoginActivity extends AppCompatActivity {

    //تعریف متغیر ها
    EditText edt_userName,edt_password;

    Button btn_login,btn_signIn;


    //تعریف کتابخانه کالی گرافی برای تغییر فونت
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //تعریف و اتصال متغیر ها به لایه xml
        edt_userName = findViewById(R.id.edt_userName);
        edt_password = findViewById(R.id.edt_password);

        btn_login = findViewById(R.id.btn_login);
        btn_signIn = findViewById(R.id.btn_signin);

        // تعریف فضای اشتراکی و ویرایش کننده
        final SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
        final SharedPreferences.Editor editor = spf.edit();

        //تعریفی کلید ثبت نام
        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //رفتن به صفحه ی ثبت نام
                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //تعریف کلید ورود
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //بررسی صحت نام کاربری و رمز عبور
                if (edt_userName.getText().toString().equals(spf.getString("userName",null)) &&
                edt_password.getText().toString().equals(spf.getString("password",null)))
                {
                    //رفتن به صفحه ی اصلی
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    //ذخیره حالت ورود برای چک کردن ورود نخست در فضای اشتراکی
                    editor.putBoolean("loginCheck",true);
                    //خاتمه صفحه
                    finish();
                }
                else
                {
                    //نمایش پیغام خظا
                    Toast.makeText(LoginActivity.this, "نام کاربری یا رمز عبور اشتباه می باشد", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
