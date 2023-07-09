package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nccaa.R;

public class ClinicalActivity3 extends AppCompatActivity {
    Button btnUploadI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinical3);

        btnUploadI = findViewById(R.id.btnSubmitId);
        btnUploadI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicalActivity3.this, ClinicalActivity4.class));

            }
        });
    }
}