package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CreateMessageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Button savebutton = findViewById(R.id.save_button);
        final MessageModel messageobject = new MessageModel();
        final EditText messagetext = findViewById(R.id.enter_message);
        final Date date = new Date();



        Spinner entry_select = findViewById(R.id.emoji_select);
        entry_select.setSelection(0);


        entry_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                messageobject.setEmoji(item.toString());

            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                messageobject.setMessage(messagetext.toString());
                messageobject.setMessageid(random.nextInt(1000)+1);
                messageobject.setUpvotes(0);
                //Get userID from Database.
                //messageobject.setUserid();
                //Get userID and use that to get User Pins
                //UserModel user = new UserModel(userid);
                //Set MessageId into Userlist of PinIds
                //user.getMessageIds;
                //add id.
                //Get UserCoordinate on Map
                //messageobject.setxcoord();
                //messageobject.setycoord();
                messageobject.setDate(date);

            }
        });





    }



}
