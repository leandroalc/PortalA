package com.example.portalaplus.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Evento;

import java.util.List;

public class AdapterEvento extends RecyclerView.Adapter<AdapterEvento.ViewHolderEvento> {

    private Evento listaEvento;

    public AdapterEvento(Evento listaEvento) {
        this.listaEvento = listaEvento;
    }

    @NonNull
    @Override
    public ViewHolderEvento onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_evento, parent, false
        );

        return new ViewHolderEvento(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEvento holder, int position) {
        Evento evento = new Evento();
        holder.exibeTitulo.setText(evento.getTitulo());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolderEvento extends RecyclerView.ViewHolder{

        private TextView exibeTitulo;
        public ViewHolderEvento(@NonNull View itemView) {
            super(itemView);

            exibeTitulo = itemView.findViewById(R.id.textViewAdapterTituloEvento);

        }
    }

}
