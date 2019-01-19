package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button confirm_button = findViewById(R.id.register_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                final EditText edit =  (EditText) findViewById(R.id.enter_password);
                String passwordString = (String) edit.getText().toString();

                boolean isAtLeast8   = passwordString.length() >= 8;
                boolean hasUppercase = !passwordString.equals(passwordString.toLowerCase());
                boolean hasLowercase = !passwordString.equals(passwordString.toUpperCase());
                boolean hasSpecial   = !passwordString.matches("[A-Za-z0-9 ]*");

                if(!isAtLeast8) {
                    Toast.makeText(RegisterActivity.this, "Password must be at least 8 characters",
                            Toast.LENGTH_LONG).show();
                }else if(!hasUppercase) {
                    Toast.makeText(RegisterActivity.this, "Password must contain Uppercase",
                            Toast.LENGTH_LONG).show();
                }else if(!hasLowercase) {
                    Toast.makeText(RegisterActivity.this, "Password must contain Lowercase",
                            Toast.LENGTH_LONG).show();
                }else if(!hasSpecial) {
                    Toast.makeText(RegisterActivity.this, "Password must contain Special characters",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    finish();
                }
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
