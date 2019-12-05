package com.example.portalaplus.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Aluno;

import java.util.List;

public class AdapterAluno extends RecyclerView.Adapter<AdapterAluno.ViewHolderAluno> {

    private Aluno listaAlunos;

    public AdapterAluno(Aluno listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @NonNull
    @Override
    public ViewHolderAluno onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_aluno, parent, false);

        return new ViewHolderAluno(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAluno holder, int position) {
        Aluno aluno = new Aluno();

        holder.labelNome.setText("Nome:");
        holder.labelTurma.setText("Turma:");
        holder.labelDisciplina.setText("Disciplinas:");
        holder.exibeNome.setText(aluno.getNome());
        holder.exibeTurma.setText(aluno.getTurma());
        holder.disciplina1.setText(aluno.getDisciplina1());
        holder.disciplina2.setText(aluno.getDisciplina2());
        holder.disciplina3.setText(aluno.getDisciplina3());
        holder.disciplina4.setText(aluno.getDisciplina4());
        holder.disciplina5.setText(aluno.getDisciplina5());

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolderAluno extends RecyclerView.ViewHolder{

        private TextView labelNome, labelTurma, labelDisciplina;
        private TextView exibeNome, exibeTurma;
        private TextView disciplina1, disciplina2, disciplina3, disciplina4, disciplina5;

        public ViewHolderAluno(@NonNull View itemView) {
            super(itemView);

            labelNome = itemView.findViewById(R.id.textViewLabelAdapterNomeAluno);
            labelTurma = itemView.findViewById(R.id.textViewLabelAdapterTurmaAluno);
            labelDisciplina = itemView.findViewById(R.id.textViewLabelAdapterDisciplinaAluno);
            exibeNome = itemView.findViewById(R.id.textViewAdapterExibeNomeAluno);
            exibeTurma = itemView.findViewById(R.id.textViewAdapterExibeTurmaAluno);
            disciplina1 = itemView.findViewById(R.id.textViewPrimeiraDisciplinaAluno);
            disciplina2 = itemView.findViewById(R.id.textViewSegundaDisciplinaAluno);
            disciplina3 = itemView.findViewById(R.id.textViewTerceiraDisciplinaAluno);
            disciplina4 = itemView.findViewById(R.id.textViewQuartaDisciplinaAluno);
            disciplina5 = itemView.findViewById(R.id.textViewQuintaDisciplinaAluno);

        }
    }

}
