package com.example.a20200318_07_listview;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract  void setupEvents(); // 이벤트 세팅

    public  abstract void setValues();


}
