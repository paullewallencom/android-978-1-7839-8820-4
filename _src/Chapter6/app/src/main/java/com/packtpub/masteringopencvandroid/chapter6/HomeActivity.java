package com.packtpub.masteringopencvandroid.chapter6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
        startActivity(new Intent(getApplicationContext(), StitchingActivity.class));
    }
}
