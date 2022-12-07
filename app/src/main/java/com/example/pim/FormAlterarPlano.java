package com.example.pim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormAlterarPlano extends AppCompatActivity {

    private Button btt_alterplano;
    private Button btt_alter_planoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_alterar_plano);

        getSupportActionBar().hide();


        IniciarComponentes();
        IniciarComponentes1();

        btt_alter_planoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormAlterarPlano.this, FormInfoCoberturas.class);
                startActivity(intent);
            }
        });

        btt_alterplano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormAlterarPlano.this, FormCoberturaRoubo.class);
                startActivity(intent);
            }
        });


    }

    private  void IniciarComponentes() {btt_alterplano = findViewById(R.id.btt_alterplano);}
    private  void IniciarComponentes1() {btt_alter_planoo = findViewById(R.id.btt_alter_planoo);}
}