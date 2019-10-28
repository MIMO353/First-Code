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

public class RegisterActivity extends AppCompatActivity {


    //تعریف متغیر ها
    EditText edt_fName, edt_lName, edt_userNmae, edt_password;

    Button btn_singin;


    //تعریف کتابخانه کالی گرافی برای تغییر فونت
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //تعریف و اتصال متغیر ها به لایه xml
        edt_fName = findViewById(R.id.edt_fName);
        edt_lName = findViewById(R.id.edtlName);
        edt_userNmae = findViewById(R.id.edt_userName);
        edt_password = findViewById(R.id.edt_password);

        btn_singin = findViewById(R.id.btn_signin);


        // تعریف فضای اشتراکی و ویرایش کننده
        final SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(RegisterActivity.this);
        final SharedPreferences.Editor editor = spf.edit();


        //تعریف کلید ثبت نام
        btn_singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //بررسی خالی نبودن فیلد ها
                if (edt_lName.getText().toString().length() == 0 || edt_fName.getText().toString().length() == 0 || edt_userNmae.getText().toString().length() == 0 || edt_password.getText().toString().length() == 0)
                {
                    //نمایش خطای خالی بودن فیلد ها
                    Toast.makeText(RegisterActivity.this, "لطفا اطلاعات را به درستی وارد کنید", Toast.LENGTH_SHORT).show();
                }
                else {
                    //ثبت اطلاعات در فضای اشتراکی
                    editor.putString("firstName", edt_fName.getText().toString());
                    editor.putString("lastName", edt_lName.getText().toString());
                    editor.putString("userName", edt_userNmae.getText().toString());
                    editor.putString("password", edt_password.getText().toString());

                    editor.commit();

                    //پیغام ثبت کامل اطلاعات
                    Toast.makeText(RegisterActivity.this, "ثبت نام انجام شد", Toast.LENGTH_SHORT).show();
                    //رفتن به صفحه ی ورود و خاتمه صفحه
                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });


    }

}
