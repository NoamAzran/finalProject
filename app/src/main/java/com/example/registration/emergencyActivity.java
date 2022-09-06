package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergencyActivity extends AppCompatActivity implements View.OnClickListener{

    Button police, medical, firefighters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        police = (Button) findViewById(R.id.police);
        police.setOnClickListener(this);

        medical = (Button) findViewById(R.id.medical);
        medical.setOnClickListener(this);

        firefighters = (Button) findViewById(R.id.firefighters);
        firefighters.setOnClickListener(this);

    }
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Intent.ACTION_CALL);
            if (v == police)
                intent.setData(Uri.parse("tel: 100"));
            else if (v == medical)
                intent.setData(Uri.parse("tel: 101"));
            else if (v == firefighters)
                intent.setData(Uri.parse("tel: 102"));


            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }

            startActivity(intent);
            }

    }





