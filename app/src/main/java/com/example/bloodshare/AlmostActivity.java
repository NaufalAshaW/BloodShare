package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tanggal : 28 April 2021
//NIM     : 10118063
//Nama    : Naufal Asha
//Kelas   : IF-2

public class AlmostActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

        Button btn = (Button) findViewById(R.id.verif_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlmostActivity.this, VerifyActivity.class));
            }
        });
    }
}
