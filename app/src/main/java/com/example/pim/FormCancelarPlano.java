package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCancelarPlano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cancelar_plano);

        getSupportActionBar().hide();
    }
}