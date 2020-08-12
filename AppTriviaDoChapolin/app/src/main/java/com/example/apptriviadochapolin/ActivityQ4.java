package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ4 extends AppCompatActivity {

    TextView txtPontosQ4;
    Button btnOpcao1Q4, btnOpcao2Q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        getSupportActionBar().hide();

        txtPontosQ4 = findViewById(R.id.txtPontosQ4);
        btnOpcao1Q4 = findViewById(R.id.btnOpcao1Q4);
        btnOpcao2Q4 = findViewById(R.id.btnOpcao2Q4);

        txtPontosQ4.setText("Pontuação Atual: "+ MainActivity.acertos);

        btnOpcao1Q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ4.this, "Não contavam com minha astúcia!", Toast.LENGTH_SHORT).show();
                MainActivity.acertos++;
                abrirQ5();
            }
        });

        btnOpcao2Q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ4.this, "Você não é fã de verdade!", Toast.LENGTH_SHORT).show();
                abrirQ5();
            }
        });

    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

    private void abrirQ5(){
        Intent janela = new Intent(this, ActivityQ5.class);
        startActivity(janela);
        finish();
    }

}