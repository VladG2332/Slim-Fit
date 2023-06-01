package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class TiposEjercicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_ejercicio);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        ImageView imgPecho = findViewById(R.id.imgPecho);
        ImageView imgBrazo = findViewById(R.id.imgBrazo);
        ImageView imgEspalda = findViewById(R.id.imgEspalda);
        ImageView imgGluteos = findViewById(R.id.imgGluteos);
        ImageView imgPierna = findViewById(R.id.imgPierna);

        imgPecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiposEjercicio.this, RutinaPechoActivity.class);
                startActivity(intent);
            }
        });

        imgBrazo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiposEjercicio.this, RutinaBrazoActivity.class);
                startActivity(intent);


            }
        });

        imgEspalda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiposEjercicio.this, RutinaEspaldaActivity.class);
                startActivity(intent);
            }
        });

        imgGluteos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiposEjercicio.this, RutinaGluteosActivity.class);
                startActivity(intent);
            }
        });

        imgPierna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiposEjercicio.this, RutinaPiernaActivity.class);
                startActivity(intent);
            }
        });
    }
}