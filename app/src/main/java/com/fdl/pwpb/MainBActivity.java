package com.fdl.pwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        TextView t = (TextView) findViewById(R.id.tv_data);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        t.setText(s);
    }
}