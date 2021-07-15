package com.example.e_babyprojectinco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView3);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();

            }

        });
    }

    public  void openActivity(){
        Intent it=new Intent(this, start02Activity.class);
        startActivity(it);
    }

}