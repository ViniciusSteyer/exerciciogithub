package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ1 extends AppCompatActivity {
    Button btnOpcao1Q1, btnOpcao2Q1;
    TextView txtPontosQ1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        getSupportActionBar().hide();

        MainActivity.mp.start();

        btnOpcao1Q1 = findViewById(R.id.btnOpcao1Q1);
        btnOpcao2Q1 = findViewById(R.id.btnOpcao2Q1);
        txtPontosQ1 = findViewById(R.id.txtPontosQ1);

        txtPontosQ1.setText("Pontuação Atual: "+ MainActivity.acertos);

        btnOpcao1Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ1.this, "Não contavam com minha astúcia!", Toast.LENGTH_SHORT).show();
                MainActivity.acertos++;
                abrirQ2();
            }
        });

        btnOpcao2Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ1.this, "Você não é fã de verdade!", Toast.LENGTH_SHORT).show();
                abrirQ2();
            }
        });

    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

        private void abrirQ2(){
            Intent janela = new Intent(this, ActivityQ2.class);
            startActivity(janela);
            finish();
        }

}