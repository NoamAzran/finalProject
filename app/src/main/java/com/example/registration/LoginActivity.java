package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //btnLogin=(Button)findViewById(R.id.btn_login);
        //btnLogin.setOnClickListener((View.OnClickListener) this);
        TextView btn=findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }
    /* @Override
    public void onClick(View v) {
        if (btnLogin==v){
            Intent intent = new Intent(this, homePageActivity.class);
            startActivity(intent);
        }
    }*/
}
