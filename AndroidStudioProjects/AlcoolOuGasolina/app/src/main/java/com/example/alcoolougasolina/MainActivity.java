package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText eText1;
    TextInputEditText eText2;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText1 = findViewById(R.id.eText1);
        eText2 = findViewById(R.id.eText2);
        text2 = findViewById(R.id.Text2);
    }

    public void verificar(View view) {

        String textoAlcool = eText1.getText().toString();
        String textoGasolina = eText2.getText().toString();

        if(textoAlcool.equals("") || textoGasolina.equals("")) {
            text2.setText("Preencha os dados corretamente!");
        } else {
            calcular(view, textoAlcool, textoGasolina);
        }
    }

    public void calcular(View view, String textoAlcool, String textoGasolina) {

        double valorAlcool = Double.parseDouble(textoAlcool);
        double valorGasolina = Double.parseDouble(textoGasolina);

            double total = valorAlcool / valorGasolina;

            if(total <= 0.7) {
                text2.setText("É melhor ir com álcool");
            } else {
                text2.setText("É melhor ir com gasolina");
            }
    }
}

