package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CalculatorActivity extends AppCompatActivity {

    //تعزیف متغیر ها
    Button btn_mul,btn_div,btn_sum,btn_min;

    EditText edt_num_1,edt_num_2;

    TextView txt_result;

    Float result;


    //تعریف کتابخانه کالی گرافی برای تغییر فونت
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //تعریف و اتصال متغیر ها به لایه xml
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_sum = findViewById(R.id.btn_sum);
        btn_min = findViewById(R.id.btn_min);

        edt_num_1 = findViewById(R.id.edt_num_1);
        edt_num_2 = findViewById(R.id.edt_num_2);

        txt_result = findViewById(R.id.txt_result);

        //تعریف کلید ضرب
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //فراخوانی تابع ضرب
                mull();
            }
        });

        //تعریف کلید تقسیم
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //فراخوانی تابع تقسیم
                div();
            }
        });

        //تعریف کلید جمع
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //فراخوانی تابع جمع
                sum();
            }
        });


        //تعریف کلید تفریق
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //فراخوانی تابع تفریق
                min();
            }
        });

    }

    //تابع ضرب اعداد
    public void mull()
    {
        //بررسی خالی نبودن فیلد ها
        if (edt_num_1.getText().toString().length() == 0 && edt_num_2.getText().toString().length() == 0){
            edt_num_1.setText("0");
            edt_num_2.setText("0");
            //نمایش پیغام خظا برای خالی بودن فیلد ها
            Toast.makeText(this, "اعداد را کامل وارد کنید", Toast.LENGTH_SHORT).show();}


        //محاسبه و ذخیره مقدار در result
        result = Float.parseFloat(edt_num_1.getText().toString()) * (Float.parseFloat(edt_num_2.getText().toString()));
        //ست کردن مقدار در textView
        txt_result.setText(String.valueOf(result));
    }

    //تابع تقسیم اعداد
    public void div()
    {
        //بررسی خالی نبودن فیلد ها
        if (edt_num_1.getText().toString().length() == 0 && edt_num_2.getText().toString().length() == 0){
            edt_num_1.setText("0");
            edt_num_2.setText("0");
            //نمایش پیغام خظا برای خالی بودن فیلد ها
            Toast.makeText(this, "اعداد را کامل وارد کنید", Toast.LENGTH_SHORT).show();}


        //محاسبه و ذخیره مقدار در result
        result = Float.parseFloat(edt_num_1.getText().toString()) / (Float.parseFloat(edt_num_2.getText().toString()));
        //ست کردن مقدار در textView
        txt_result.setText(String.valueOf(result));
    }


    //تابع جمع اعداد
    public void sum()
    {
        //بررسی خالی نبودن فیلد ها
        if (edt_num_1.getText().toString().length() == 0 && edt_num_2.getText().toString().length() == 0){
            edt_num_1.setText("0");
            edt_num_2.setText("0");
            //نمایش پیغام خظا برای خالی بودن فیلد ها
            Toast.makeText(this, "اعداد را کامل وارد کنید", Toast.LENGTH_SHORT).show();}


        //محاسبه و ذخیره مقدار در result
        result = Float.parseFloat(edt_num_1.getText().toString()) + (Float.parseFloat(edt_num_2.getText().toString()));
        //ست کردن مقدار در textView
        txt_result.setText(String.valueOf(result));
    }

    //تابع تفریق اعداد
    public void min()
    {
        //بررسی خالی نبودن فیلد ها
        if (edt_num_1.getText().toString().length() == 0 && edt_num_2.getText().toString().length() == 0){
            edt_num_1.setText("0");
            edt_num_2.setText("0");
            //نمایش پیغام خظا برای خالی بودن فیلد ها
            Toast.makeText(this, "اعداد را کامل وارد کنید", Toast.LENGTH_SHORT).show();}


        //محاسبه و ذخیره مقدار در result
        result = Float.parseFloat(edt_num_1.getText().toString()) - (Float.parseFloat(edt_num_2.getText().toString()));
        //ست کردن مقدار در textView
        txt_result.setText(String.valueOf(result));
    }
}
