package com.example.german.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Actividad3 extends Ej4Actividades {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent intent = getIntent();

  }

  @Override
  protected Intent getMyIntent(String nombreBoton) {
    return new Intent(Actividad3.this, getActividad(nombreBoton));
}

  @Override
  protected String getNombreActividad() {
    return "Actividad 3";
  }

  @Override
  protected String getNombreBoton1() {
    return "Actividad 1";
  }

  @Override
  protected String getNombreBoton2() {
    return "Actividad 2";
  }
}
