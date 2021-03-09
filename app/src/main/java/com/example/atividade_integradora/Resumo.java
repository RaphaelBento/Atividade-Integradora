package com.example.atividade_integradora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resumo extends AppCompatActivity {
public Double [] ListaDePrecos = {2.69,2.70,16.70,3.30,3.00,5.00};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);
        Intent intent = getIntent();
        String precos = intent.getStringExtra("Valor");
        Double precocorrigido = Double.parseDouble(precos) + ListaDePrecos[0];
        String correto = precocorrigido.toString();
       // String precos = intent.getStringExtra("PrecoFeij");
        TextView PrecoV = findViewById(R.id.Precos);
        PrecoV.setText("Preços:" + correto);
    }


    public void VoltarParaInicio(View view){
        Intent Voltar = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(Voltar);
    }
}
