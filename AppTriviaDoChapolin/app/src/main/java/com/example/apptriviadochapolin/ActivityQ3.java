package com.example.apptriviadochapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ3 extends AppCompatActivity {

    Button btnOpcao1Q3, btnOpcao2Q3;
    TextView txtPontosQ3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        getSupportActionBar().hide();

        btnOpcao1Q3 = findViewById(R.id.btnOpcao1Q3);
        btnOpcao2Q3 = findViewById(R.id.btnOpcao2Q3);
        txtPontosQ3 = findViewById(R.id.txtPontosQ3);

        txtPontosQ3.setText("Pontuação Atual: "+MainActivity.acertos);

        btnOpcao1Q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ3.this, "Não contavam com minha astúcia!", Toast.LENGTH_SHORT).show();
                MainActivity.acertos++;
                AbrirQ4();
            }
        });

        btnOpcao2Q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityQ3.this, "Você não é fã de verdade!", Toast.LENGTH_SHORT).show();
                AbrirQ4();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Você não pode voltar!", Toast.LENGTH_SHORT).show();
    }

    private void AbrirQ4(){
        Intent janela = new Intent(this, ActivityQ4.class);
        startActivity(janela);
        finish();
    }



}