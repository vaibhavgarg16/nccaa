package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nccaa.R;

public class ForgotPasswordActivity2 extends AppCompatActivity {
    Button btnSendId;
    ImageView back;
    TextView txtRecId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password2);

        btnSendId = findViewById(R.id.btnSendId);
        back = findViewById(R.id.back);
        txtRecId = findViewById(R.id.txtRecId);


        btnSendId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordActivity2.this, CheckEmailActivity.class));
            }
        });

        txtRecId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordActivity2.this, ForgotPasswordNumberActivity.class));
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