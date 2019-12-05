package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Responsavel;

public class PerfilActivity extends AppCompatActivity {

    private Responsavel responsavel = new Responsavel();
    private TextView exibeNome, exibeEmail;
    private Button btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        exibeNome = findViewById(R.id.textViewExibeNomeResponsavel);
        exibeEmail = findViewById(R.id.textViewExibeEmailResponsavel);
        btSair = findViewById(R.id.buttonSair);

        exibeNome.setText(responsavel.getNome());
        exibeEmail.setText(responsavel.getEmail());

    }
}
