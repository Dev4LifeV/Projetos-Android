package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abrirToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Toast aberto com sucesso!", Toast.LENGTH_SHORT);
        toast.show();
    }
}