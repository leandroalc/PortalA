package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Evento;

import java.util.Map;

public class DetalhesEventoActivity extends AppCompatActivity {

    private TextView exibeTitulo, exibeDescricao, exibeEndereco;
    private Button consultaEndereco;
    private Evento eventoDetalhe = new Evento();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_evento);

        exibeTitulo = findViewById(R.id.textViewExibeDetalheTitulo);
        exibeDescricao = findViewById(R.id.textViewExibeDetalheDescricao);
        exibeEndereco = findViewById(R.id.textViewExibeDetalheEndereco);
        consultaEndereco = findViewById(R.id.buttonConsultarEndereco);

        exibeTitulo.setText(eventoDetalhe.getTitulo());
        exibeDescricao.setText(eventoDetalhe.getDescricao());
        exibeEndereco.setText(eventoDetalhe.getEndereco());

        consultaEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //MapaEventoActivity mapaEventoActivity = new MapaEventoActivity();

                //mapaEventoActivity.passarEndrecoEvento(exibeEndereco.getText().toString());

                Intent intent = new Intent(DetalhesEventoActivity.this, MapaEventoActivity.class);
                intent.putExtra("nomeEndereco",exibeEndereco.getText().toString());
                startActivity(intent);
                finish();

            }
        });

    }
}
