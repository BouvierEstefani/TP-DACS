package com.example.german.ej3ciudades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Ciudades extends AppCompatActivity {

  private Spinner paises, ciudades;
  private TextView textView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ciudades);

    paises = (Spinner)findViewById(R.id.paises);
    ciudades = (Spinner)findViewById(R.id.ciudades);
    textView = (TextView)findViewById(R.id.editText);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.paises, R.layout.support_simple_spinner_dropdown_item);
    this.paises.setAdapter(adapter);
    paises.setSelection(0);

    paises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String pais = parent.getItemAtPosition(position).toString();
        obtenerCiudades(pais);
      }

      @Override
      public void onNothingSelected(AdapterView<?> parent) {

      }
    });
    ciudades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String ciudad = parent.getItemAtPosition(position).toString();
        obtenerCiudad(ciudad);
      }

      @Override
      public void onNothingSelected(AdapterView<?> parent) {

      }
    });

  }

  private void obtenerCiudad(String ciudad) {
    textView.setText(ciudad);
  }

  private void obtenerCiudades(String pais) {
    ArrayAdapter<CharSequence> adapter = null;
    switch (pais) {
      case "Argentina":
        adapter = ArrayAdapter.createFromResource(this, R.array.ciudadesarg, R.layout.support_simple_spinner_dropdown_item);
        break;
      case "Uruguay":
        adapter = ArrayAdapter.createFromResource(this, R.array.ciudadesuru, R.layout.support_simple_spinner_dropdown_item);
        break;
      case "Brasil":
        adapter = ArrayAdapter.createFromResource(this, R.array.ciudadesbra, R.layout.support_simple_spinner_dropdown_item);
        break;
    }
    if (adapter!=null)
    this.ciudades.setAdapter(adapter);
  }
}
