package com.noobdevs.infinityread;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add extends AppCompatActivity
{

    Button editAddSubmit ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editAddSubmit = findViewById(R.id.btn_Add_Submit);

        editAddSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Add.this , Homepage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}