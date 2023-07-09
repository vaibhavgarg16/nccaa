package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.nccaa.R;

public class ClinicActivity3 extends AppCompatActivity {
    ImageView back;
    Button btnSaveId;
    EditText date,category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic3);

        back = findViewById(R.id.back);
        btnSaveId = findViewById(R.id.btnSaveId);
        date = findViewById(R.id.date);
        category = findViewById(R.id.category);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnSaveId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicActivity3.this, ClinicActivity5.class));
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicActivity3.this, ClinicActivity6.class));
            }
        });
        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicActivity3.this, ClinicActivity4.class));
            }
        });
    }
}