package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.portalaplus.R;

public class MenuActivity extends AppCompatActivity {

    private Button btPerfil, btEvento, btAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btPerfil = findViewById(R.id.buttonPerfil);
        btEvento = findViewById(R.id.buttonEvento);
        btAluno = findViewById(R.id.buttonAluno);

        btPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, PerfilActivity.class));
            }
        });

        btEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, EventoActivity.class));
            }
        });

        btAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, AlunoActivity.class));
            }
        });

    }
}
