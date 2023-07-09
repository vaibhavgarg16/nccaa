package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nccaa.R;

public class ClinicalActivity2 extends AppCompatActivity {

    Button btnSubmitId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinical2);
        btnSubmitId =findViewById(R.id.btnSubmitId);

        btnSubmitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicalActivity2.this, ClinicalActivity3.class));
            }
        });
    }
}