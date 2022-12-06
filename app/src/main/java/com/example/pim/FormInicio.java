package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormInicio extends AppCompatActivity {

    private Button btt_meu_plano;
    private Button btt_suportesac;
    private Button btt_cadastrarusu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_inicio);

        getSupportActionBar().hide();
        IniciarComponentes();
        Iniciarsuporte();
        IniciarPlano();


        btt_meu_plano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormInicio.this, FormMeuplano.class);
                startActivity(intent);
            }
        });

        btt_suportesac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormInicio.this, FormSuporteSAC.class);
                startActivity(intent);
            }
        });

        btt_cadastrarusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormInicio.this, FormCadastro.class);
                startActivity(intent);
            }
        });


    }

    private  void IniciarComponentes() {btt_meu_plano = findViewById(R.id.btt_meu_plano);}
    private  void Iniciarsuporte() {btt_suportesac = findViewById(R.id.btt_suportesac);}
    private  void IniciarPlano() {btt_cadastrarusu = findViewById(R.id.btt_cadastrarusu);}
}