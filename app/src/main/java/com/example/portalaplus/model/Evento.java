package com.example.portalaplus.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Evento implements Parcelable {

    private String titulo = "Semana da Engenharia na Faculdade IBRATEC";
    private String descricao = "Evento Semana da Engenharia, contaremos com palestras de empresas, workshops, demonstração de projetos e muito mais!" +
            " Não fique fora dessa e venha para este evento com a gente!";
    private String endereco = "Estr. da Batalha, 1201 - Prazeres, Jaboatão dos Guararapes - PE, 54315-570";

    public Evento() {
    }

    protected Evento(Parcel in) {
        titulo = in.readString();
        descricao = in.readString();
        endereco = in.readString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static final Creator<Evento> CREATOR = new Creator<Evento>() {
        @Override
        public Evento createFromParcel(Parcel in) {
            return new Evento(in);
        }

        @Override
        public Evento[] newArray(int size) {
            return new Evento[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(titulo);
        parcel.writeString(descricao);
        parcel.writeString(endereco);
    }
}
