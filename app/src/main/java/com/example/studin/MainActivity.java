package com.example.studin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView profileTV, contantsTV, courseTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileTV = findViewById(R.id.profile);
        contantsTV = findViewById(R.id.telephone);
        courseTV = findViewById(R.id.coarse);

        profileTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proAct = new Intent(MainActivity.this, profileActivity.class);
                startActivity(proAct);
            }
        });

        contantsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conAct = new Intent(MainActivity.this, contacts.class);
                startActivity(conAct);
            }
        });

        courseTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent courseAct = new Intent(MainActivity.this, course.class);
                startActivity(courseAct);
            }
        });
    }
}