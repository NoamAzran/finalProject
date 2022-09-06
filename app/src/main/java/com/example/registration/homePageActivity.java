package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homePageActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imgbtn=(ImageButton)findViewById(R.id.police);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homePageActivity.this, emergencyActivity.class));
            }
        });

    }


    @Override
    public void onClick(View v) {
        if (imgbtn == v){
            Intent intent = new Intent(homePageActivity.this, emergencyActivity.class);
            startActivity(intent);
        }
    }
}