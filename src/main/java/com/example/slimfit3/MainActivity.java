package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String sexo = "";

    boolean hombre;
    boolean mujer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        String RegistroCompleto = preferences.getString("RegistroCompleto", "");

        if (RegistroCompleto.equals("Verdadero")){
            Intent intent = new Intent(MainActivity.this, EjerciciosActivity.class);
            startActivity(intent);
        }



        ImageView botonHombre = findViewById(R.id.botonHombre);

        ImageView botonMujer = findViewById(R.id.botonMujer);

        botonHombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonHombre.setBackgroundColor(Color.argb(29,179,171,171));
                botonMujer.setBackgroundColor(Color.argb(0,0,0,0));
                hombre = true;
                mujer = false;
            }
        });


        botonMujer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonMujer.setBackgroundColor(Color.argb(29,179,171,171));
                botonHombre.setBackgroundColor(Color.argb(0,0,0,0));
                hombre = false;
                mujer = true;
            }
        });

        Button botonSiguiente = findViewById(R.id.botonSiguiente1);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hombre) {
                    sexo = "Hombre";
                    Intent intent = new Intent(getApplicationContext(), PesoEstaturaActivity.class);
                    intent.putExtra("sexo", sexo);
                    startActivity(intent);

                } else if (mujer) {
                    sexo = "Mujer";
                    Intent intent = new Intent(getApplicationContext(), PesoEstaturaActivity.class);
                    intent.putExtra("sexo", sexo);
                    startActivity(intent);


                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Elija una opción", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }
}