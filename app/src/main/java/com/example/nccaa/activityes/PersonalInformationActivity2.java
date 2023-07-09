package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nccaa.R;

public class PersonalInformationActivity2 extends AppCompatActivity {
    Button btnContinueId;
    ImageView imgLeftArrowId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information2);
        btnContinueId = findViewById(R.id.btnContinueId);
        imgLeftArrowId = findViewById(R.id.imgLeftArrowId);

        btnContinueId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PersonalInformationActivity2.this, AddressActivity.class));
            }
        });

        imgLeftArrowId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}