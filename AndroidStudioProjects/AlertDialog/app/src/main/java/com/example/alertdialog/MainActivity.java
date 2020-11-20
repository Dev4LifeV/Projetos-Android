package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirAlertDialog(View view) {

        // Instanciar o AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar o título e mensagem
        dialog.setTitle("Informação");
        dialog.setMessage("Deseja executar a ação?");

        //Configurar ações para sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast sim = Toast.makeText(getApplicationContext(), "Botão sim clicado", Toast.LENGTH_SHORT);
                sim.show();
            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast nao = Toast.makeText(getApplicationContext(), "Botão não clicado", Toast.LENGTH_SHORT);
                nao.show();
            }
        });

        //Ícone
        dialog.setIcon(R.mipmap.ic_launcher);

        //Configurar cancelamento
        dialog.setCancelable(false);

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }

}