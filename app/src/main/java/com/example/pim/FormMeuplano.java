package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormMeuplano extends AppCompatActivity {

    private Button btt_apolice;
    private Button btt_alterplano;
    private Button btt_cancelarplano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_meuplano);

        getSupportActionBar().hide();
        IniciarComponentes();
        IniciarComponentes1();
        Iniciarapolice();

        btt_apolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMeuplano.this, FormAcionarApolice.class);
                startActivity(intent);
            }
        });

        btt_cancelarplano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMeuplano.this, FormCancelarPlano.class);
                startActivity(intent);
            }
        });

        btt_alterplano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMeuplano.this, FormAlterarPlano.class);
                startActivity(intent);
            }
        });
    }

    private  void IniciarComponentes() {btt_alterplano = findViewById(R.id.btt_alterplano);}
    private  void IniciarComponentes1() {btt_cancelarplano = findViewById(R.id.btt_cancelarplano);}
    private  void Iniciarapolice() {btt_apolice = findViewById(R.id.btt_apolice);}
}