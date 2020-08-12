package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ5 extends AppCompatActivity {

    TextView txtPontosQ5;
    Button btnOpcao1Q5, btnOpcao2Q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        getSupportActionBar().hide();

        txtPontosQ5 = findViewById(R.id.txtPontosQ5);
        btnOpcao1Q5 = findViewById(R.id.btnOpcao1Q5);
        btnOpcao2Q5 = findViewById(R.id.btnOpcao2Q5);

        txtPontosQ5.setText("Pontuação Atual: "+ MainActivity.acertos);

        btnOpcao1Q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ5.this, "Você não é fã de verdade!", Toast.LENGTH_SHORT).show();
                abrirFinal();

            }
        });

        btnOpcao2Q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ5.this, "Não contavam com minha astúcia!", Toast.LENGTH_SHORT).show();
                MainActivity.acertos++;
                abrirFinal();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

    public void abrirFinal(){
        Intent janela = new Intent(this, ActivityFinal.class);
        startActivity(janela);
        finish();
    }

}