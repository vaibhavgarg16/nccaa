package com.example.nccaa.activityes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.nccaa.R;

public class OtpActivity extends AppCompatActivity {

    Button btnOtpId;

    Toolbar mytoolbar;
    private androidx.appcompat.widget.Toolbar supportActionBar;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        mytoolbar =  findViewById(R.id.myToolbar);
        setSupportActionBar(mytoolbar);

        init();
        btnOtpId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtpActivity.this, OtpActivity1.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void init() {
        btnOtpId = findViewById(R.id.btnOtpId);
        back = findViewById(R.id.back);
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}