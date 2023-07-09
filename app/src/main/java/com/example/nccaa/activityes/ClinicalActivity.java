package com.example.nccaa.activityes;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nccaa.R;
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog;
import com.google.android.material.textfield.TextInputLayout;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class ClinicalActivity extends AppCompatActivity {

    private static final int FILE_SELECT_CODE = 0;
    private static final int FILE_SELECT_CODE2 = 1;
    private static final int FILE_SELECT_CODE3 = 2;
    private static final int PERMISSION_REQUEST_CODE = 200;
    ImageView back;
    EditText date1, date2, date3;
    TextView txtAddCompetencyId, delete1, delete2, delete3;
    int i = 0;
    LinearLayout datanewadd1, datanewadd2, datanewadd3;
    Button btnUploadId1, btnUploadId2, btnUploadId3, btnSubmitId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinical);

        back = findViewById(R.id.back);
        date1 = findViewById(R.id.date1);
        date2 = findViewById(R.id.date2);
        date3 = findViewById(R.id.date3);
        datanewadd1 = findViewById(R.id.datanewadd1);
        datanewadd2 = findViewById(R.id.datanewadd2);
        datanewadd3 = findViewById(R.id.datanewadd3);
        txtAddCompetencyId = findViewById(R.id.txtAddCompetencyId);
        delete1 = findViewById(R.id.delete1);
        delete2 = findViewById(R.id.delete2);
        delete3 = findViewById(R.id.delete3);
        btnUploadId1 = findViewById(R.id.btnUploadId1);
        btnUploadId2 = findViewById(R.id.btnUploadId2);
        btnUploadId3 = findViewById(R.id.btnUploadId3);
        btnSubmitId = findViewById(R.id.btnSubmitId);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

//        txtAddCompetencyId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (i == 0) {
//                    datanewadd1.setVisibility(View.VISIBLE);
//                    i++;
//                } else if (i == 1) {
//                    datanewadd2.setVisibility(View.VISIBLE);
//                    i++;
//                }else if (i == 2) {
//                    datanewadd3.setVisibility(View.VISIBLE);
//                    i++;
//                }else {
//                    i = 0;
//                }
//            }
//        });

        btnSubmitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClinicalActivity.this, ClinicalActivity2.class));
            }
        });

        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datanewadd1.setVisibility(View.GONE);
            }
        });
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datanewadd2.setVisibility(View.GONE);
            }
        });
        delete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datanewadd3.setVisibility(View.GONE);
            }
        });

        date1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SingleDateAndTimePickerDialog.Builder(ClinicalActivity.this)
                        .bottomSheet()
                        .curved()
                        .displayMinutes(false)
                        .displayHours(false)
                        .displayDays(false)
                        .displayMonth(true)
                        .displayYears(true)
                        .displayDaysOfMonth(true)
                        .display();
            }
        });
        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SingleDateAndTimePickerDialog.Builder(ClinicalActivity.this)
                        .bottomSheet()
                        .curved()
                        .displayMinutes(false)
                        .displayHours(false)
                        .displayDays(false)
                        .displayMonth(true)
                        .displayYears(true)
                        .displayDaysOfMonth(true)
                        .display();
            }
        });
        date3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SingleDateAndTimePickerDialog.Builder(ClinicalActivity.this)
                        .bottomSheet()
                        .curved()
                        .displayMinutes(false)
                        .displayHours(false)
                        .displayDays(false)
                        .displayMonth(true)
                        .displayYears(true)
                        .displayDaysOfMonth(true)
                        .display();
            }
        });

        btnUploadId1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                showFileChooser(FILE_SELECT_CODE);
            }
        });
        btnUploadId2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                showFileChooser(FILE_SELECT_CODE2);
            }
        });
        btnUploadId3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                showFileChooser(FILE_SELECT_CODE3);
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "permission granted", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                try {
                    startActivityForResult(Intent.createChooser(intent, "Select a File to Upload"), FILE_SELECT_CODE);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(this, "Please install a File Manager.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Storage permission denied", Toast.LENGTH_LONG).show();
            }

        }

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void showFileChooser(int FILE_SELECT_CODE) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
            //File write logic here
        } else {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            try {
                startActivityForResult(Intent.createChooser(intent, "Select a File to Upload"), FILE_SELECT_CODE);
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(this, "Please install a File Manager.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
/*
        switch (requestCode) {
            case FILE_SELECT_CODE:
                if (resultCode == RESULT_OK) {
                    // Get the Uri of the selected file


                }
            case FILE_SELECT_CODE2:
                if (resultCode == RESULT_OK) {
                    // Get the Uri of the selected file
                    Uri uri = data.getData();
                    Log.d(TAG, "File Uri: " + uri.getPath());
                    btnUploadId2.setText(uri.getPath());
                }
            case FILE_SELECT_CODE3:
                if (resultCode == RESULT_OK) {
                    // Get the Uri of the selected file
                    Uri uri = data.getData();
                    Log.d(TAG, "File Uri: " + uri.getPath());
                    btnUploadId3.setText(uri.getPath());
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + requestCode);
        }
*/
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == FILE_SELECT_CODE) {
                Uri uri = data.getData();
                Log.d(TAG, "File Uri: " + uri.getPath());
                btnUploadId1.setText(uri.getPath());
            } else if (requestCode == FILE_SELECT_CODE2) {
                Uri uri = data.getData();
                Log.d(TAG, "File Uri: " + uri.getPath());
                btnUploadId2.setText(uri.getPath());
            } else if (requestCode == FILE_SELECT_CODE3) {
                Uri uri = data.getData();
                Log.d(TAG, "File Uri: " + uri.getPath());
                btnUploadId3.setText(uri.getPath());
            }
        }
    }
}