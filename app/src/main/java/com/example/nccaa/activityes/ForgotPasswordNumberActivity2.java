package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nccaa.R;

public class ForgotPasswordNumberActivity2 extends AppCompatActivity {
    Button btnSendId;
    ImageView back;
    TextView txtRecId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_number2);
        btnSendId = findViewById(R.id.btnSendId);
        back = findViewById(R.id.back);
        txtRecId = findViewById(R.id.txtRecId);

        btnSendId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordNumberActivity2.this, OtpActivity.class));
            }
        });
        txtRecId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordNumberActivity2.this, ForgotPasswordActivity.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}