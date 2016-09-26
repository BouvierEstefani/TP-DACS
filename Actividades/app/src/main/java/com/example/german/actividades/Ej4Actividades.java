package com.example.german.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ej4Actividades extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ej4_actividades);
    View myMainLayout = findViewById(R.id.myMainLayout);
    TextView textView = (TextView) myMainLayout.findViewById(R.id.textView);
    Button button = (Button)myMainLayout.findViewById(R.id.button);
    Button button2 = (Button)myMainLayout.findViewById(R.id.button2);

    textView.setText(getNombreActividad());
    button.setText(getNombreBoton1());
    button2.setText(getNombreBoton2());

   button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
       startActivity(getMyIntent(getNombreBoton1()));
     }
   });
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(getMyIntent(getNombreBoton2()));
      }
    });
  }

  protected Intent getMyIntent (String nombreBoton){
    return new Intent(Ej4Actividades.this, getActividad(nombreBoton));
  }

  protected Class getActividad (String nombreActividad) {
    switch (nombreActividad){
      case "Actividad 1": return Ej4Actividades.class;
      case "Actividad 2": return Actividad2.class;
      case "Actividad 3": return Actividad3.class;
      default: return this.getClass();
    }
  }

  protected String getNombreActividad (){
    return "Actividad 1";
  }
  protected String getNombreBoton1 (){
    return "Actividad 2";
  }
  protected String getNombreBoton2 (){
    return "Actividad 3";
  }
}
