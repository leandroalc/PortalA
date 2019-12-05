package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.portalaplus.R;
import com.example.portalaplus.RecyclerItemClickListener;
import com.example.portalaplus.adapter.AdapterAluno;
import com.example.portalaplus.model.Aluno;

public class AlunoActivity extends AppCompatActivity {

    private RecyclerView recyclerViewAluno;
    private Spinner spinnerAluno;
    private Button btListarAluno;
    private Aluno alunos = new Aluno();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        recyclerViewAluno = findViewById(R.id.recyclerViewAluno);
        spinnerAluno = findViewById(R.id.spinnerAluno);
        btListarAluno = findViewById(R.id.buttonListarAluno);

        carregarDadosSpinner();

        btListarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdapterAluno adapterAluno = new AdapterAluno(alunos);

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerViewAluno.setLayoutManager(layoutManager);
                recyclerViewAluno.setHasFixedSize(true);
                recyclerViewAluno.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
                recyclerViewAluno.setAdapter(adapterAluno);
            }
        });

        recyclerViewAluno.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerViewAluno,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getApplicationContext(), NotaActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(),
                                "Não segure o clique.",
                                Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }));

    }

    private void carregarDadosSpinner(){
        String[] aluno = new String[]{
                "Nenhum", alunos.getNome()
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, aluno
        );
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAluno.setAdapter(arrayAdapter);

    }

}
