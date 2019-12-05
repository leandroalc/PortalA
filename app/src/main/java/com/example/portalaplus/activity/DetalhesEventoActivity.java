package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Evento;

public class DetalhesEventoActivity extends AppCompatActivity {

    private TextView exibeTitulo, exibeDescricao, exibeEndereco;
    private Evento eventoDetalhe = new Evento();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_evento);

        exibeTitulo = findViewById(R.id.textViewExibeDetalheTitulo);
        exibeDescricao = findViewById(R.id.textViewExibeDetalheDescricao);
        exibeEndereco = findViewById(R.id.textViewExibeDetalheEndereco);

        exibeTitulo.setText(eventoDetalhe.getTitulo());
        exibeDescricao.setText(eventoDetalhe.getDescricao());
        exibeEndereco.setText(eventoDetalhe.getEndereco());

    }
}
