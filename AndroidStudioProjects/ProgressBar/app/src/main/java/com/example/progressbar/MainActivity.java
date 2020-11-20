package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar horizontal;
    ProgressBar circular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       horizontal = findViewById(R.id.progressHorizontal);
       circular = findViewById(R.id.progress_circular);

    }

    int progresso = 0;

    public void carregarProgressBar(View view) {
        this.progresso = this.progresso + 1;
        horizontal.setProgress(this.progresso);

        circular.setVisibility(View.VISIBLE);
    }
}