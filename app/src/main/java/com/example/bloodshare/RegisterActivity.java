package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

//Tanggal : 28 April 2021
//NIM     : 10118063
//Nama    : Naufal Asha
//Kelas   : IF-2

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner bloodType = (Spinner) findViewById(R.id.spin_blood);
        ArrayAdapter bloodList = ArrayAdapter.createFromResource(this, R.array.bloodtype, R.layout.spinner);
        bloodList.setDropDownViewResource(R.layout.spinner);
        bloodType.setAdapter(bloodList);

        Spinner rhesus = (Spinner) findViewById(R.id.spin_rhesus);
        ArrayAdapter rhesusList = ArrayAdapter.createFromResource(this,R.array.reshus, R.layout.spinner);
        rhesusList.setDropDownViewResource(R.layout.spinner);
        rhesus.setAdapter(rhesusList);

        Spinner job = (Spinner) findViewById(R.id.spin_job);
        ArrayAdapter jobList = ArrayAdapter.createFromResource(this,R.array.job, R.layout.spinner);
        jobList.setDropDownViewResource(R.layout.spinner);
        job.setAdapter(jobList);

        Button btn = (Button) findViewById(R.id.btn_register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, AlmostActivity.class));
            }
        });

    }
}
