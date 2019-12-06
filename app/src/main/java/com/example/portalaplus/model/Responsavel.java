package com.example.portalaplus.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Responsavel implements Parcelable {

    private String nome = "Responsável Teste";
    private String email = "responsavel@gmail.com";
    private String senha = "responsavel";
    private Aluno aluno;

    public Responsavel() {
        this.aluno = new Aluno();
    }

    protected Responsavel(Parcel in) {
        nome = in.readString();
        email = in.readString();
    }

    public static final Creator<Responsavel> CREATOR = new Creator<Responsavel>() {
        @Override
        public Responsavel createFromParcel(Parcel in) {
            return new Responsavel(in);
        }

        @Override
        public Responsavel[] newArray(int size) {
            return new Responsavel[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nome);
        parcel.writeString(email);
    }
}
