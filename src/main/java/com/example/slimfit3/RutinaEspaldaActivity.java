package com.example.slimfit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class RutinaEspaldaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_espalda);

        TextView viewEncabezado = findViewById(R.id.viewEncabezado2);
        GifImageView imgRutina = findViewById(R.id.imgRutina2);
        TextView viewContador = findViewById(R.id.viewContador2);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.whistle);
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.bell);
        Button btnTerminado = findViewById(R.id.btnTerminado2);

        SharedPreferences preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);



        viewEncabezado.setText("Rutina");
        imgRutina.setImageResource(R.drawable.routine3);
        imgRutina.setVisibility(View.VISIBLE);
        btnTerminado.setVisibility(View.INVISIBLE);
        mp1.start();

        imgRutina.setImageResource(R.drawable.routine11);

        new CountDownTimer(4000,1000) {
            public void onTick(long minsHastaFinal) {
                long segundos = minsHastaFinal / 1000;
                viewContador.setText(Long.toString(segundos));
            }
            public void onFinish() {

                viewEncabezado.setText("Descanso");
                imgRutina.setVisibility(View.INVISIBLE);
                mp.start();

                new CountDownTimer(4000,1000) {
                    public void onTick(long minsHastaFinal) {
                        long segundos = minsHastaFinal / 1000;
                        viewContador.setText(Long.toString(segundos));
                    }
                    public void onFinish() {

                        viewEncabezado.setText(("Rutina"));
                        imgRutina.setVisibility(View.VISIBLE);
                        imgRutina.setImageResource(R.drawable.routine6);
                        mp1.start();

                        new CountDownTimer(4000,1000) {
                            public void onTick(long minsHastaFinal) {
                                long segundos = minsHastaFinal / 1000;
                                viewContador.setText(Long.toString(segundos));
                            }
                            public void onFinish() {

                                viewEncabezado.setText(("Descanso"));
                                imgRutina.setVisibility(View.INVISIBLE);
                                mp.start();

                                new CountDownTimer(4000,1000) {
                                    public void onTick(long minsHastaFinal) {
                                        long segundos = minsHastaFinal / 1000;
                                        viewContador.setText(Long.toString(segundos));
                                    }
                                    public void onFinish() {

                                        viewEncabezado.setText(("Rutina"));
                                        imgRutina.setVisibility(View.VISIBLE);
                                        imgRutina.setImageResource(R.drawable.routine9);
                                        mp1.start();

                                        new CountDownTimer(4000,1000) {
                                            public void onTick(long minsHastaFinal) {
                                                long segundos = minsHastaFinal / 1000;
                                                viewContador.setText(Long.toString(segundos));
                                            }
                                            public void onFinish() {

                                                viewEncabezado.setText(("Descanso"));
                                                imgRutina.setVisibility(View.INVISIBLE);
                                                mp.start();

                                                new CountDownTimer(4000,1000) {
                                                    public void onTick(long minsHastaFinal) {
                                                        long segundos = minsHastaFinal / 1000;
                                                        viewContador.setText(Long.toString(segundos));
                                                    }
                                                    public void onFinish() {

                                                        viewEncabezado.setText(("Rutina"));
                                                        imgRutina.setVisibility(View.VISIBLE);
                                                        imgRutina.setImageResource(R.drawable.routine23);
                                                        viewContador.setText("x18");
                                                        btnTerminado.setVisibility(View.VISIBLE);
                                                        mp1.start();

                                                        btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {

                                                                viewEncabezado.setText(("Descanso"));
                                                                imgRutina.setVisibility(View.INVISIBLE);
                                                                btnTerminado.setVisibility(View.INVISIBLE);
                                                                mp.start();

                                                                new CountDownTimer(4000,1000) {
                                                                    public void onTick(long minsHastaFinal) {
                                                                        long segundos = minsHastaFinal / 1000;
                                                                        viewContador.setText(Long.toString(segundos));
                                                                    }
                                                                    public void onFinish() {

                                                                        new CountDownTimer(4000,1000) {
                                                                            public void onTick(long minsHastaFinal) {
                                                                                long segundos = minsHastaFinal / 1000;
                                                                                viewContador.setText(Long.toString(segundos));
                                                                            }
                                                                            public void onFinish() {

                                                                                viewEncabezado.setText(("Rutina"));
                                                                                imgRutina.setVisibility(View.VISIBLE);
                                                                                imgRutina.setImageResource(R.drawable.routine8);
                                                                                btnTerminado.setVisibility(View.VISIBLE);
                                                                                mp1.start();
                                                                                viewContador.setText("x25");

                                                                                btnTerminado.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {

                                                                                        viewEncabezado.setText(("Descanso"));
                                                                                        imgRutina.setVisibility(View.INVISIBLE);
                                                                                        btnTerminado.setVisibility(View.INVISIBLE);
                                                                                        mp.start();

                                                                                        new CountDownTimer(4000,1000) {
                                                                                            public void onTick(long minsHastaFinal) {
                                                                                                long segundos = minsHastaFinal / 1000;
                                                                                                viewContador.setText(Long.toString(segundos));
                                                                                            }
                                                                                            public void onFinish() {

                                                                                                Intent intent = new Intent(RutinaEspaldaActivity.this, EjerciciosActivity.class);
                                                                                                startActivity(intent);

                                                                                                Toast.makeText(RutinaEspaldaActivity.this, "Felicidades, lograste el entrenamiento", Toast.LENGTH_LONG).show();

                                                                                                SharedPreferences.Editor editor = preferences.edit();
                                                                                                editor.putString("Calorias", "1,250");
                                                                                                editor.apply();
                                                                                                finish();

                                                                                            }
                                                                                        }.start();

                                                                                    }
                                                                                });

                                                                            }
                                                                        }.start();

                                                                    }
                                                                }.start();

                                                            }
                                                        });

                                                    }
                                                }.start();
                                            }
                                        }.start();

                                    }
                                }.start();

                            }
                        }.start();

                    }
                }.start();

            }
        }.start();


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
}