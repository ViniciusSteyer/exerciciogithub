package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ2 extends AppCompatActivity {

    Button btnOpcao1Q2, btnOpcao2Q2;
    TextView txtPontosQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        getSupportActionBar().hide();

        btnOpcao1Q2 = findViewById(R.id.btnOpcao1Q2);
        btnOpcao2Q2 = findViewById(R.id.btnOpcao2Q2);
        txtPontosQ2 = findViewById(R.id.txtPontosQ2);

        txtPontosQ2.setText("Pontuação Atual: " +MainActivity.acertos);

        btnOpcao1Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ2.this, "Você não é fã de verdade!", Toast.LENGTH_SHORT).show();
                abrirQ3();
            }
        });

        btnOpcao2Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ2.this, "Não contavam com minha astúcia!", Toast.LENGTH_SHORT).show();
                MainActivity.acertos++;
                abrirQ3();
            }
        });

    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

    public void abrirQ3(){
        Intent janela = new Intent(this, ActivityQ3.class);
        startActivity(janela);
        finish();
    }

}