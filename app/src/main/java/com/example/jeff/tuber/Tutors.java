package com.example.jeff.tuber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tutors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button tutorSubmit = (Button)findViewById(R.id.tutorSubmit);

        tutorSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        EditText editTextName = (EditText)findViewById(R.id.editTextName);
                        EditText editTextRate = (EditText)findViewById(R.id.editTextRate);
                        EditText tutorSubmit = (EditText)findViewById(R.id.tutorSubmit);
                        String name = editTextName.toString();
                        int rate = editTextRate.toString();

                        tutorSubmit.setText(name);

                        //ParseObject tutorInfo = new ParseObject("TutorInfo");
                        //gameScore.put("name", name);
                        //gameScore.put("rate", rate);
                        //gameScore.put("cheatMode", false);
                        //gameScore.saveInBackground();
                    }
                }
        );
    }
}