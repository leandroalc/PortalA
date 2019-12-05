package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.portalaplus.R;
import com.example.portalaplus.RecyclerItemClickListener;
import com.example.portalaplus.adapter.AdapterEvento;
import com.example.portalaplus.model.Evento;

import java.util.ArrayList;
import java.util.List;

public class EventoActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEvento;
    private Button btListarEvento;
    private Evento evento = new Evento();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        recyclerViewEvento = findViewById(R.id.recyclerViewEvento);
        btListarEvento = findViewById(R.id.buttonListarEventos);



        btListarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdapterEvento adapterEvento = new AdapterEvento(evento);

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerViewEvento.setLayoutManager(layoutManager);
                recyclerViewEvento.setHasFixedSize(true);
                recyclerViewEvento.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
                recyclerViewEvento.setAdapter(adapterEvento);
            }
        });

        recyclerViewEvento.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerViewEvento,
                new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(getApplicationContext(), DetalhesEventoActivity.class);
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
}
