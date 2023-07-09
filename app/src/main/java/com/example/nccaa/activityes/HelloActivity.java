package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nccaa.PrivacyActivity;
import com.example.nccaa.R;

public class HelloActivity extends AppCompatActivity {

    CardView importance,cdqexam,viewcertificate,btncme,admin,clinical,history,notic,getSupport,condition,privacy,certificateExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        importance = findViewById(R.id.importance);
        cdqexam = findViewById(R.id.cdqexam);
        viewcertificate = findViewById(R.id.viewcertificate);
        btncme = findViewById(R.id.btncme);
        admin = findViewById(R.id.admin);
        clinical = findViewById(R.id.clinical);
        history = findViewById(R.id.history);
        notic = findViewById(R.id.notic);
        getSupport = findViewById(R.id.getSupport);
        condition = findViewById(R.id.condition);
        privacy = findViewById(R.id.privacy);
        certificateExam = findViewById(R.id.certificateExam);

        importance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, ImportantDatesActivity.class));

            }
        });
        cdqexam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, CdqInfoActivity.class));

            }
        });
        viewcertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, CertificateActivity.class));

            }
        });
        btncme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, CmeInfoActivity.class));

            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, AdminActivity.class));

            }
        });
        clinical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, ClinicActivity1.class));

            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, Phase2Activity.class));

            }
        });
        notic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, Phase2Activity.class));

            }
        });
        getSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, SupportActivity.class));

            }
        });
        condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, Phase2Activity.class));

            }
        });
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, Phase2Activity.class));

            }
        });
        certificateExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloActivity.this, PrivacyActivity.class));

            }
        });
    }
}