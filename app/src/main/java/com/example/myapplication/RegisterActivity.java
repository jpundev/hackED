package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button confirm_button = findViewById(R.id.register_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                finish();
            }
        });

        Button back_button = findViewById(R.id.back_register);
        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V){
                finish();
            }
        });

    }
}
