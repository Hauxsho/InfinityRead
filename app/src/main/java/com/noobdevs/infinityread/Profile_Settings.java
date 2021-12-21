package com.noobdevs.infinityread;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile_Settings extends AppCompatActivity {

    Button editProfileSubmit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__settings);

        editProfileSubmit = findViewById(R.id.btn_EditProfile_Submit);

        editProfileSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_Settings.this , Homepage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}