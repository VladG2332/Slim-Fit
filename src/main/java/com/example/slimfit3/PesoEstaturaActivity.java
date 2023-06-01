package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class PesoEstaturaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_estatura);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Intent intent = getIntent();

        String sexo = intent.getStringExtra("sexo");

        NumberPicker selectorKilos = findViewById(R.id.pesoKilos);
        selectorKilos.setMinValue(50);
        selectorKilos.setMaxValue(150);
        selectorKilos.setWrapSelectorWheel(false);

        NumberPicker selectorEstatura = findViewById(R.id.selectorEstatura);
        selectorEstatura.setMinValue(80);
        selectorEstatura.setMaxValue(200);
        selectorEstatura.setWrapSelectorWheel(false);

        Button botonSiguiente = findViewById(R.id.botonSiguiente2);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String peso = String.valueOf(selectorKilos.getValue());
                String altura = String.valueOf(selectorEstatura.getValue());

                Intent intent = new Intent(getApplicationContext(), DatosActivity.class);
                intent.putExtra("sexo", sexo);
                intent.putExtra("peso", peso);
                intent.putExtra("altura", altura);
                startActivity(intent);


            }
        });


    }
}