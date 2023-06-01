package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.FileObserver;
import android.os.TestLooperManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class EjerciciosActivity extends AppCompatActivity {

    private int stepCount = 0;
    private SensorManager sensorManager;
    private Sensor stepCounterSensor;

    private String calorias = "";
    private int vasos = 0;
    private float imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        String nombre = preferences.getString("Nombre", "");

        String alturastr = preferences.getString("altura", "");
        String pesostr = preferences.getString("peso", "");

        int peso = Integer.parseInt(pesostr);
        int altura = Integer.parseInt(alturastr);

        TextView viewIMC = findViewById(R.id.viewIMC);

        float alturaF = (float) altura / 100;
        float pesoF = (float) peso;
        float alturaSqr = alturaF * alturaF;
        imc = pesoF / alturaSqr;

        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        imc = Float.parseFloat(decimalFormat.format(imc));

        if (imc < 18.5) {
            viewIMC.setText(Float.toString(imc));
            viewIMC.setTextColor(Color.parseColor("#FF0000"));
        } else if (imc >= 18.6 && imc < 24.9) {
            viewIMC.setText(Float.toString(imc));
            viewIMC.setTextColor(Color.parseColor("#00FF00"));
        } else if (imc >= 25.0 && imc < 29.9) {
            viewIMC.setText(Float.toString(imc));
            viewIMC.setTextColor(Color.parseColor("#FFA500"));
        } else if (imc >= 30.0) {
            viewIMC.setText(Float.toString(imc));
            viewIMC.setTextColor(Color.parseColor("##FF0000"));
        }

        ImageView imgVaso = findViewById(R.id.imgVaso);

        TextView viewNombre = findViewById(R.id.viewNombre);
        TextView viewCalorias = findViewById(R.id.viewCalorias);
        TextView viewVasos = findViewById(R.id.viewVasos);
        TextView viewPasos = findViewById(R.id.viewPasos);

        viewNombre.setText("¡Hola " + nombre + "!");





        if (preferences.getString("Calorias", "") != "") {
            calorias = preferences.getString("Calorias", "");
            viewCalorias.setText(calorias);
        }




        imgVaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vasos = Integer.parseInt(viewVasos.getText().toString());
                vasos++;
                if (vasos > 8) {
                    Toast.makeText(EjerciciosActivity.this, "Ya tomaste el agua suficiente por el día de hoy.", Toast.LENGTH_SHORT).show();
                } else {
                    viewVasos.setText(String.valueOf(vasos));
                }


            }
        });

        Button btnEjercicios = findViewById(R.id.btnEjercicios);

        btnEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), TiposEjercicio.class);
                startActivity(intent);
            }
        });

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        stepCounterSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

        if (stepCounterSensor == null) {
            Toast.makeText(this, "Step counter sensor not found", Toast.LENGTH_SHORT).show();
        }

        viewPasos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                viewPasos.setText("0");
                return true;
            }
        });

    }


    private final SensorEventListener stepCounterListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            stepCount = (int) event.values[0];
            updateStepCountDisplay();
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        if (stepCounterSensor != null) {
            sensorManager.registerListener(stepCounterListener, stepCounterSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(stepCounterListener);
    }

    private void updateStepCountDisplay() {
        TextView stepCountTextView = findViewById(R.id.viewPasos);
        stepCountTextView.setText(String.valueOf(stepCount));
    }

}



