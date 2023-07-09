package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.nccaa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ClinicActivity2 extends AppCompatActivity {
    ImageView back;
    FloatingActionButton floating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic2);
        back = findViewById(R.id.back);
        floating = findViewById(R.id.floating);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicActivity2.this, ClinicActivity3.class));

            }
        });
    }
}