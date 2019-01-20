package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    private UserModel user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button confirm_button = findViewById(R.id.register_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                final EditText password = findViewById(R.id.enter_password);
                final EditText email = findViewById(R.id.enter_email);

                String passwordString = password.getText().toString();
                String emailString = email.getText().toString();

                boolean isAtLeast8   = passwordString.length() >= 8;
                boolean hasUppercase = !passwordString.equals(passwordString.toLowerCase());
                boolean hasLowercase = !passwordString.equals(passwordString.toUpperCase());
                boolean hasSpecial   = !passwordString.matches("[A-Za-z0-9 ]*");



                Pattern p = Pattern.compile("\\b[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,4}\\b");
                Matcher m = p.matcher(emailString.toUpperCase());


                if (!m.find()) {
                    Toast.makeText(RegisterActivity.this, "Email bad",
                             Toast.LENGTH_LONG).show();
                    return;
                }

                else if(!isAtLeast8) {
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
                    user.setPassword(passwordString);
                    user.setUsername(emailString);
                    Random rand = new Random();
                    user.setUserid(rand.nextInt(10000)+1);
                    // Send to database
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
