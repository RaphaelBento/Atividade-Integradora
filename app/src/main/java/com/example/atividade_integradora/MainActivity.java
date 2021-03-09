package com.example.atividade_integradora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView Preco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrParaFinalizarCompra(View view) {
        Intent intent = new Intent(this, Resumo.class);
        Preco = (TextView) findViewById(R.id.IdPrecoMacarrao);
        String message = Preco.getText().toString();
        intent.putExtra("Valor",message);
        startActivity(intent);
    }

}