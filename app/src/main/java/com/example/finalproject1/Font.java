package com.example.finalproject1;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

//این کلاس برای تغییر فونت برنامه ی باشد که از کتابخانه CalligraphyConfig استفاده می کند
public class Font extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("B-NAZANIN.TTF")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
    }


