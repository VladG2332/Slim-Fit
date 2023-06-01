package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Intent intent = getIntent();

        String sexo = intent.getStringExtra("sexo");
        String peso = intent.getStringExtra("peso");
        String altura = intent.getStringExtra("altura");

        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        Button botonSiguiente3 = findViewById(R.id.botonSiguiente3);

        EditText textNombre = findViewById(R.id.textboxNombre);
        EditText textApellido = findViewById(R.id.textboxApellido);
        EditText textEdad = findViewById(R.id.textboxEdad);





        botonSiguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = textNombre.getText().toString();
                String apellido = textApellido.getText().toString();
                int edad = Integer.parseInt(textEdad.getText().toString());

                if (nombre.matches("") || apellido.matches("") || String.valueOf(edad).matches("") ){
                    Toast toast = Toast.makeText(getApplicationContext(), "Por favor llene todos los campos", Toast.LENGTH_LONG);
                    toast.show();
                } else {

                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("RegistroCompleto", "Verdadero");
                    editor.putString("Nombre", nombre);
                    editor.putString("altura", altura);
                    editor.putString("peso", peso);
                    editor.apply();

                    Intent intent = new Intent(DatosActivity.this, EjerciciosActivity.class);
                    startActivity(intent);

                }

            }
        });
    }

}