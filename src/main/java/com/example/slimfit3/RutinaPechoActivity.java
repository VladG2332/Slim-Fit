package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class RutinaPechoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_pecho);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);

        TextView viewContador = findViewById(R.id.viewContador6);
        TextView viewEncabezado = findViewById(R.id.viewEncabezado6);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.whistle);
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.bell);
        GifImageView imgRutina = findViewById(R.id.imgRutina6);
        Button btnTerminado = findViewById(R.id.btnTerminado6);

        btnTerminado.setVisibility(View.INVISIBLE);

        //Empieza Rutina
        imgRutina.setImageResource(R.drawable.routine4);
        new CountDownTimer(4000,1000){

            public void onTick(long minsHastaFinal) {
                long segundos = minsHastaFinal / 1000;
                viewContador.setText(Long.toString(segundos));
            }

            public void onFinish(){
                viewEncabezado.setText("Descanso");
                imgRutina.setVisibility(View.INVISIBLE);
                mp.start();

                //Empieza descanso
                new CountDownTimer(4000,1000){
                    public void onTick(long minsHastaFinal) {
                        long segundos = minsHastaFinal / 1000;
                        viewContador.setText(Long.toString(segundos));
                    }

                    public void onFinish(){
                        viewEncabezado.setText("Rutina");
                        imgRutina.setVisibility(View.VISIBLE);
                        mp1.start();

                        //Empieza Rutina
                        imgRutina.setImageResource(R.drawable.routine1);
                        new CountDownTimer(4000,1000){

                            public void onTick(long minsHastaFinal) {
                                long segundos = minsHastaFinal / 1000;
                                viewContador.setText(Long.toString(segundos));
                            }

                            public void onFinish(){
                                viewEncabezado.setText("Descanso");
                                imgRutina.setVisibility(View.INVISIBLE);
                                mp.start();

                                //Empieza descanso
                                new CountDownTimer(4000,1000){
                                    public void onTick(long minsHastaFinal) {
                                        long segundos = minsHastaFinal / 1000;
                                        viewContador.setText(Long.toString(segundos));
                                    }

                                    public void onFinish(){
                                        viewEncabezado.setText("Rutina");
                                        imgRutina.setVisibility(View.VISIBLE);
                                        mp1.start();

                                        //Empieza Rutina
                                        imgRutina.setImageResource(R.drawable.routine5);
                                        new CountDownTimer(4000,1000){

                                            public void onTick(long minsHastaFinal) {
                                                long segundos = minsHastaFinal / 1000;
                                                viewContador.setText(Long.toString(segundos));
                                            }

                                            public void onFinish(){
                                                viewEncabezado.setText("Descanso");
                                                imgRutina.setVisibility(View.INVISIBLE);
                                                mp.start();

                                                //Empieza descanso
                                                new CountDownTimer(4000,1000){
                                                    public void onTick(long minsHastaFinal) {
                                                        long segundos = minsHastaFinal / 1000;
                                                        viewContador.setText(Long.toString(segundos));
                                                    }

                                                    public void onFinish(){
                                                        viewEncabezado.setText("Rutina");
                                                        imgRutina.setVisibility(View.VISIBLE);
                                                        mp1.start();

                                                        //Empieza Rutina
                                                        imgRutina.setImageResource(R.drawable.routine8);
                                                        viewContador.setText("x20");

                                                        btnTerminado.setVisibility(View.VISIBLE);

                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                viewEncabezado.setText("Descanso");
                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                mp.start();
                                                                btnTerminado.setVisibility(View.INVISIBLE);

                                                                new CountDownTimer(4000,1000){
                                                                    public void onTick(long minsHastaFinal) {
                                                                        long segundos = minsHastaFinal / 1000;
                                                                        viewContador.setText(Long.toString(segundos));
                                                                    }

                                                                    public void onFinish(){
                                                                        viewEncabezado.setText("Rutina");
                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                        mp1.start();

                                                                        //Empieza Rutina
                                                                        imgRutina.setImageResource(R.drawable.routine25);
                                                                        viewContador.setText("x25");

                                                                        btnTerminado.setVisibility(View.VISIBLE);

                                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                viewEncabezado.setText("Descanso");
                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                mp.start();
                                                                                btnTerminado.setVisibility(View.INVISIBLE);
                                                                                new CountDownTimer(4000,1000){

                                                                                    public void onTick(long minsHastaFinal) {
                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                    }

                                                                                    public void onFinish(){
                                                                                        viewEncabezado.setText("Rutina");
                                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                                        mp1.start();

                                                                                        //Empieza Rutina
                                                                                        imgRutina.setImageResource(R.drawable.routine9);
                                                                                        new CountDownTimer(4000,1000){

                                                                                            public void onTick(long minsHastaFinal) {
                                                                                                long segundos = minsHastaFinal / 1000;
                                                                                                viewContador.setText(Long.toString(segundos));
                                                                                            }

                                                                                            public void onFinish(){
                                                                                                viewEncabezado.setText("Descanso");
                                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                                mp.start();

                                                                                                //Empieza descanso
                                                                                                new CountDownTimer(4000,1000){
                                                                                                    public void onTick(long minsHastaFinal) {
                                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                                    }

                                                                                                    public void onFinish(){
                                                                                                        viewEncabezado.setText("Rutina");
                                                                                                        imgRutina.setVisibility(View.VISIBLE);

                                                                                                        mp1.start();
                                                                                                        //Empieza Rutina
                                                                                                        imgRutina.setImageResource(R.drawable.routine16);
                                                                                                        new CountDownTimer(4000,1000){

                                                                                                            public void onTick(long minsHastaFinal) {
                                                                                                                long segundos = minsHastaFinal / 1000;
                                                                                                                viewContador.setText(Long.toString(segundos));
                                                                                                            }

                                                                                                            public void onFinish(){
                                                                                                                viewEncabezado.setText("Descanso");
                                                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                                                mp.start();

                                                                                                                //Empieza descanso
                                                                                                                new CountDownTimer(4000,1000){
                                                                                                                    public void onTick(long minsHastaFinal) {
                                                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                                                    }

                                                                                                                    public void onFinish(){
                                                                                                                        viewEncabezado.setText("Rutina");
                                                                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                                                                        viewContador.setText("x20");
                                                                                                                        btnTerminado.setVisibility(View.VISIBLE);
                                                                                                                        mp1.start();

                                                                                                                        //Empieza Rutina
                                                                                                                        imgRutina.setImageResource(R.drawable.routine23);

                                                                                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View view) {

                                                                                                                                viewEncabezado.setText("Descanso");
                                                                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                                                                btnTerminado.setVisibility(View.INVISIBLE);
                                                                                                                                mp.start();

                                                                                                                                //Empieza descanso
                                                                                                                                new CountDownTimer(4000,1000){
                                                                                                                                    public void onTick(long minsHastaFinal) {
                                                                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                                                                    }

                                                                                                                                    public void onFinish(){
                                                                                                                                        viewEncabezado.setText("Rutina");
                                                                                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                                                                                        btnTerminado.setVisibility(View.VISIBLE);

                                                                                                                                        imgRutina.setImageResource(R.drawable.routine8);
                                                                                                                                        viewContador.setText("x20");
                                                                                                                                        mp1.start();

                                                                                                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                                                                                                            @Override
                                                                                                                                            public void onClick(View view) {
                                                                                                                                                viewEncabezado.setText("Descanso");
                                                                                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                                                                                btnTerminado.setVisibility(View.INVISIBLE);
                                                                                                                                                mp.start();

                                                                                                                                                new CountDownTimer(4000,1000){
                                                                                                                                                    public void onTick(long minsHastaFinal) {
                                                                                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                                                                                    }
                                                                                                                                                    public void onFinish(){

                                                                                                                                                        viewEncabezado.setText("Rutina");
                                                                                                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                                                                                                        btnTerminado.setVisibility(View.VISIBLE);
                                                                                                                                                        mp1.start();

                                                                                                                                                        imgRutina.setImageResource(R.drawable.routine25);
                                                                                                                                                        viewContador.setText("x25");

                                                                                                                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                            @Override
                                                                                                                                                            public void onClick(View view) {

                                                                                                                                                                viewEncabezado.setText("Descanso");
                                                                                                                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                                                                                                                btnTerminado.setVisibility(View.INVISIBLE);
                                                                                                                                                                mp.start();

                                                                                                                                                                new CountDownTimer(4000,1000) {
                                                                                                                                                                    public void onTick(long minsHastaFinal) {
                                                                                                                                                                        long segundos = minsHastaFinal / 1000;
                                                                                                                                                                        viewContador.setText(Long.toString(segundos));
                                                                                                                                                                    }
                                                                                                                                                                    public void onFinish() {

                                                                                                                                                                        viewEncabezado.setText("Rutina");
                                                                                                                                                                        imgRutina.setVisibility(View.VISIBLE);
                                                                                                                                                                        mp1.start();

                                                                                                                                                                        imgRutina.setImageResource(R.drawable.routine11);

                                                                                                                                                                        new CountDownTimer(4000,1000) {
                                                                                                                                                                            public void onTick(long minsHastaFinal) {
                                                                                                                                                                                long segundos = minsHastaFinal / 1000;
                                                                                                                                                                                viewContador.setText(Long.toString(segundos));
                                                                                                                                                                            }
                                                                                                                                                                            public void onFinish() {

                                                                                                                                                                                Intent intent = new Intent(RutinaPechoActivity.this, EjerciciosActivity.class);
                                                                                                                                                                                startActivity(intent);

                                                                                                                                                                                Toast.makeText(RutinaPechoActivity.this, "Felicidades, lograste el entrenamiento", Toast.LENGTH_LONG).show();

                                                                                                                                                                                SharedPreferences.Editor editor = preferences.edit();
                                                                                                                                                                                editor.putString("Calorias", "1,250");
                                                                                                                                                                                editor.apply();
                                                                                                                                                                                finish();

                                                                                                                                                                            }
                                                                                                                                                                        }.start();
                                                                                                                                                                    }
                                                                                                                                                                }.start();
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                    }
                                                                                                                                                }.start();
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        //Termina Descanso
                                                                                                                                    }
                                                                                                                                }.start();
                                                                                                                            }
                                                                                                                        });
                                                                                                                        //Termina Descanso
                                                                                                                    }
                                                                                                                }.start();
                                                                                                            }
                                                                                                        }.start(); //Termina Rutina
                                                                                                        //Termina Descanso
                                                                                                    }
                                                                                                }.start();
                                                                                            }
                                                                                        }.start(); //Termina Rutina
                                                                                        //Termina Descanso
                                                                                    }
                                                                                }.start();
                                                                            }
                                                                        });
                                                                    }
                                                                }.start();
                                                            }
                                                        });
                                                        //Termina Descanso
                                                    }
                                                }.start();
                                            }
                                        }.start(); //Termina Rutina
                                        //Termina Descanso
                                    }
                                }.start();
                            }
                        }.start(); //Termina Rutina
                        //Termina Descanso
                    }
                }.start();
            }
        }.start(); //Termina Rutina
    }
}