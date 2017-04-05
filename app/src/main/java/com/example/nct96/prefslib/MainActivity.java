package com.example.nct96.prefslib;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        PrefsUtil.with(mContext).write("testInt",55);
        PrefsUtil.with(mContext).write("testString","str");
        PrefsUtil.with(mContext).write("testFloat",21.5f);
        PrefsUtil.with(mContext).write("testBoolean",true);
        PrefsUtil.with(mContext).write("Username","user");
        PrefsUtil.with(mContext).write("Password","password");

        Log.e(TAG,"Prefs Int : "+PrefsUtil.with(this).readInt("testInt"));
        Log.e(TAG,"Prefs String : "+PrefsUtil.with(this).readString("testString"));
        Log.e(TAG,"Prefs Float : "+PrefsUtil.with(this).readFloat("testFloat"));
        Log.e(TAG,"Prefs Boolean : "+PrefsUtil.with(this).readBoolean("testBoolean"));
        Log.e(TAG,"Prefs Boolean : "+PrefsUtil.with(this).readString("Password"));

    }
}
