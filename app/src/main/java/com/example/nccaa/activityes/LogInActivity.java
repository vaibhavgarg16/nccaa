package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nccaa.R;

public class LogInActivity extends AppCompatActivity {

    Button btnLoginId;
    ImageView face;
    TextView txtForgPassId,notice,privacy,condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        init();

        btnLoginId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, PsiMandatoryActivity.class));
            }
        });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, FaceRecogActivity1.class));
            }
        });
        txtForgPassId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, ForgotPasswordActivity.class));
            }
        });

        condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, BlanckActivity.class));
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, BlanckActivity.class));
            }
        });

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, BlanckActivity.class));
            }
        });
    }

    private void init() {
        btnLoginId = findViewById(R.id.btnLoginId);
        face = findViewById(R.id.face);
        txtForgPassId = findViewById(R.id.txtForgPassId);
        condition = findViewById(R.id.condition);
        privacy = findViewById(R.id.privacy);
        notice = findViewById(R.id.notice);
    }
}