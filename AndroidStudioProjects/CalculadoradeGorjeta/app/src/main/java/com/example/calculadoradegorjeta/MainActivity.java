package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textEdit;
    SeekBar seek;
    TextView porcento;
    TextView gorjeta;
    TextView total;
    int porcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEdit = findViewById(R.id.textEdit);
        seek = findViewById(R.id.seek);
        gorjeta = findViewById(R.id.text4);
        total = findViewById(R.id.text5);
        porcento = findViewById(R.id.text);

        seek.setEnabled(false);

        textEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(textEdit.getText().length() <= 0) {
                    seek.setEnabled(false);
                } else {
                    seek.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(textEdit.getText().length() <= 0) {
                    seek.setEnabled(false);
                } else {
                    seek.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(textEdit.getText().length() <= 0) {
                    seek.setEnabled(false);
                } else {
                    seek.setEnabled(true);
                }
            }
        });

            seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    porcentagem = progress;
                    porcento.setText(seek.getProgress() + "%");

                    String valorDigitado = textEdit.getText().toString();

                    Double valor = Double.parseDouble(valorDigitado);
                    Double mostrarPorcentagem = (porcentagem * valor) / 100;
                    gorjeta.setText(mostrarPorcentagem.toString());

                    Double totalComGorjeta = valor + mostrarPorcentagem;
                    total.setText(totalComGorjeta.toString());
                }


                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    if(textEdit.getText().length() <= 0) {
                        seek.setEnabled(false);
                    } else {
                        seek.setEnabled(true);
                    }
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    if(textEdit.getText().length() <= 0) {
                        seek.setEnabled(false);
                    } else {
                        seek.setEnabled(true);
                    }
                }
            });
        }
    }


