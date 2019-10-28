package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    //تعریف شی ارایه
    ArrayList<String> array=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //تعریف مقادیر آرایه
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("f");
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("f");
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("f");
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("f");

        //اتصال لیست ویو به فایل xml
        ListView listView = findViewById(R.id.list_view);

        //تعریف آداپتور برای لیست ویو
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,array);

        //اتصال لیست ویو به آداپتور
        listView.setAdapter(adapter);
    }
}
