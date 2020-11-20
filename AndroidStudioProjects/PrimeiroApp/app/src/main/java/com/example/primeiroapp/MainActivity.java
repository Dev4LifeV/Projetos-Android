package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar (View view) {

        EditText nome = findViewById(R.id.EditText1);
        EditText email = findViewById(R.id.EditText2);

        TextView mostrarNome = findViewById(R.id.Text1);
        TextView mostrarEmail = findViewById(R.id.Text2);
        TextView mostrarVermelho = findViewById(R.id.Text3);
        TextView mostrarBranco = findViewById(R.id.Text4);
        TextView mostrarVerde = findViewById(R.id.Text5);
        TextView mostrarSexo = findViewById(R.id.Text8);

        CheckBox vermelho = findViewById(R.id.check1);
        CheckBox branco = findViewById(R.id.check2);
        CheckBox verde = findViewById(R.id.check3);

        String nomeObtido = nome.getText().toString();
        String emailObtido = email.getText().toString();

        String vermelhoSelecionado = vermelho.getText().toString();
        String brancoSelecionado = branco.getText().toString();
        String verdeSelecionado = verde.getText().toString();

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton rButton1 = findViewById(R.id.rButton1);
        RadioButton rButton2 = findViewById(R.id.rButton2);

        String masculinoSelecionado = rButton1.getText().toString();
        String femininoSelecionado = rButton2.getText().toString();


        if(vermelho.isChecked()) {
            mostrarVermelho.setText(vermelhoSelecionado);
            mostrarVermelho.setVisibility(View.VISIBLE);
        }
        if(branco.isChecked()) {
            mostrarBranco.setText(brancoSelecionado);
            mostrarBranco.setVisibility(View.VISIBLE);
        }
        if(verde.isChecked()) {
            mostrarVerde.setText(verdeSelecionado);
            mostrarVerde.setVisibility(View.VISIBLE);
        }

        if(radioGroup.getCheckedRadioButtonId() == rButton1.getId()) {
            mostrarSexo.setText(masculinoSelecionado);
            mostrarSexo.setVisibility(View.VISIBLE);
        } else {
            mostrarSexo.setText(femininoSelecionado);
            mostrarSexo.setVisibility(View.VISIBLE);
        }

        mostrarNome.setText(nomeObtido);
        mostrarEmail.setText(emailObtido);
        mostrarNome.setVisibility(View.VISIBLE);
        mostrarEmail.setVisibility(View.VISIBLE);


    }

}