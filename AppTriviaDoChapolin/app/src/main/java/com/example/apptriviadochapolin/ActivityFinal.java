package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class ActivityFinal extends AppCompatActivity {
    Button btnSair, btnReiniciar;
    TextView txtPontosFinal;
    VideoView vdvFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        getSupportActionBar().hide();

        btnSair = findViewById(R.id.btnSair);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtPontosFinal = findViewById(R.id.txtPontosFinal);
        vdvFinal = findViewById(R.id.vdvFinal);

        MainActivity.mp.stop();

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bonus);
        vdvFinal.setVideoURI(caminho);
        vdvFinal.start();

        txtPontosFinal.setText("Pontuação Final: " + MainActivity.acertos);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vdvFinal.stopPlayback();
                MainActivity.acertos = 0;
                abrirMain();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

    private void abrirMain(){
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        finish();
    }

}