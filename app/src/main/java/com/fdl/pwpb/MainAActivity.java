package com.fdl.pwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a);

        final EditText name = (EditText) findViewById(R.id.et_data);
        Button btnSubmit = (Button) findViewById(R.id.btn_submit_intent);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainAActivity.this, MainBActivity.class);
                i.putExtra("name", name.getText().toString());
                startActivity(i);
            }
        });
    }
}