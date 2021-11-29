package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button contato;
    Button servicos;
    Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contato = (Button) findViewById(R.id.btnContato);
        servicos = (Button) findViewById(R.id.btnServicos);
        sair = (Button) findViewById(R.id.btnSair);

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent( MainActivity.this, Contato.class);
                startActivity(func);
            }
        });

        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent( MainActivity.this, Serviços.class);
                startActivity(func);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent();
                finish();
            }
        });

    }
}