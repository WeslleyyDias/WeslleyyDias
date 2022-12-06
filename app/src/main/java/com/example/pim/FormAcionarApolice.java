package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormAcionarApolice extends AppCompatActivity {

    private Button btt_apolice2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_acionar_apolice);
        Iniciarapolice();

        btt_apolice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (FormAcionarApolice.this, FormSuporteSAC.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();
    }

    private void Iniciarapolice(){btt_apolice2 = findViewById(R.id.btt_apolice2);}
}