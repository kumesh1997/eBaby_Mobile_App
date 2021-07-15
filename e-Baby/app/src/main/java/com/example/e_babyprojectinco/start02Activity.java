package com.example.e_babyprojectinco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class start02Activity extends AppCompatActivity {

    private ImageButton pBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start02);
        pBtn=findViewById(R.id.parentBtn);
        pBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    OpenActivity();
            }


        });


    }

    public void OpenActivity(){
        Intent it=new Intent(this,signInActivity.class);
        startActivity(it);
    }




}