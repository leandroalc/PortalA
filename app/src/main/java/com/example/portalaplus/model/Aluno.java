package com.example.portalaplus.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Aluno implements Parcelable {

    private String nome = "José Silva";
    private String turma = "9º ano";
    private String disciplina1 = "Português";
    private String disciplina2 = "Matemática";
    private String disciplina3 = "Ciências";
    private String disciplina4 = "História";
    private String disciplina5 = "Geografia";
    private double notaBimestre1Pt = 8.5, notaBimestre2Pt = 9.0, notaBimestre3Pt = 10.0, notaBimestre4Pt = 8.0, notaRecuperacaoPt = 0.0, mediaBimestrePt = 8.8, notaFinalPt = 0.0, mediaAnualPt = 8.8;
    private double notaBimestre1Mt = 9.5, notaBimestre2Mt = 10.0, notaBimestre3Mt = 10.0, notaBimestre4Mt = 9.5, notaRecuperacaoMt = 0.0, mediaBimestreMt = 9.8, notaFinalMt = 0.0, mediaAnualMt = 9.8;
    private double notaBimestre1Ci = 7.5, notaBimestre2Ci = 5.5, notaBimestre3Ci = 6.0, notaBimestre4Ci = 8.5, notaRecuperacaoCi = 8.0, mediaBimestreCi = 6.9, notaFinalCi = 0.0, mediaAnualCi = 7.5;
    private double notaBimestre1Hs = 10.0, notaBimestre2Hs = 9.5, notaBimestre3Hs = 10.0, notaBimestre4Hs = 9.0, notaRecuperacaoHs = 0.0, mediaBimestreHs = 9.7, notaFinalHs = 0.0, mediaAnualHs = 9.7;
    private double notaBimestre1Ge = 9.0, notaBimestre2Ge = 10.0, notaBimestre3Ge = 8.5, notaBimestre4Ge = 9.0, notaRecuperacaoGe = 0.0, mediaBimestreGe  = 9.2, notaFinalGe = 0.0, mediaAnualGe = 9.2;


    public Aluno() {

    }

    protected Aluno(Parcel in) {
        nome = in.readString();
        turma = in.readString();
        disciplina1 = in.readString();
        disciplina2 = in.readString();
        disciplina3 = in.readString();
        disciplina4 = in.readString();
        disciplina5 = in.readString();
        notaBimestre1Pt = in.readDouble();
        notaBimestre2Pt = in.readDouble();
        notaBimestre3Pt = in.readDouble();
        notaBimestre4Pt = in.readDouble();
        notaRecuperacaoPt = in.readDouble();
        mediaBimestrePt = in.readDouble();
        notaFinalPt = in.readDouble();
        mediaAnualPt = in.readDouble();
        notaBimestre1Mt = in.readDouble();
        notaBimestre2Mt = in.readDouble();
        notaBimestre3Mt = in.readDouble();
        notaBimestre4Mt = in.readDouble();
        notaRecuperacaoMt = in.readDouble();
        mediaBimestreMt = in.readDouble();
        notaFinalMt = in.readDouble();
        mediaAnualMt = in.readDouble();
        notaBimestre1Ci = in.readDouble();
        notaBimestre2Ci = in.readDouble();
        notaBimestre3Ci = in.readDouble();
        notaBimestre4Ci = in.readDouble();
        notaRecuperacaoCi = in.readDouble();
        mediaBimestreCi = in.readDouble();
        notaFinalCi = in.readDouble();
        mediaAnualCi = in.readDouble();
        notaBimestre1Hs = in.readDouble();
        notaBimestre2Hs = in.readDouble();
        notaBimestre3Hs = in.readDouble();
        notaBimestre4Hs = in.readDouble();
        notaRecuperacaoHs = in.readDouble();
        mediaBimestreHs = in.readDouble();
        notaFinalHs = in.readDouble();
        mediaAnualHs = in.readDouble();
        notaBimestre1Ge = in.readDouble();
        notaBimestre2Ge = in.readDouble();
        notaBimestre3Ge = in.readDouble();
        notaBimestre4Ge = in.readDouble();
        notaRecuperacaoGe = in.readDouble();
        mediaBimestreGe = in.readDouble();
        notaFinalGe = in.readDouble();
        mediaAnualGe = in.readDouble();
    }

    public static final Creator<Aluno> CREATOR = new Creator<Aluno>() {
        @Override
        public Aluno createFromParcel(Parcel in) {
            return new Aluno(in);
        }

        @Override
        public Aluno[] newArray(int size) {
            return new Aluno[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    public String getDisciplina5() {
        return disciplina5;
    }

    public void setDisciplina5(String disciplina5) {
        this.disciplina5 = disciplina5;
    }

    public double getNotaBimestre1Pt() {
        return notaBimestre1Pt;
    }

    public void setNotaBimestre1Pt(double notaBimestre1Pt) {
        this.notaBimestre1Pt = notaBimestre1Pt;
    }

    public double getNotaBimestre2Pt() {
        return notaBimestre2Pt;
    }

    public void setNotaBimestre2Pt(double notaBimestre2Pt) {
        this.notaBimestre2Pt = notaBimestre2Pt;
    }

    public double getNotaBimestre3Pt() {
        return notaBimestre3Pt;
    }

    public void setNotaBimestre3Pt(double notaBimestre3Pt) {
        this.notaBimestre3Pt = notaBimestre3Pt;
    }

    public double getNotaBimestre4Pt() {
        return notaBimestre4Pt;
    }

    public void setNotaBimestre4Pt(double notaBimestre4Pt) {
        this.notaBimestre4Pt = notaBimestre4Pt;
    }

    public double getNotaRecuperacaoPt() {
        return notaRecuperacaoPt;
    }

    public void setNotaRecuperacaoPt(double notaRecuperacaoPt) {
        this.notaRecuperacaoPt = notaRecuperacaoPt;
    }

    public double getMediaBimestrePt() {
        return mediaBimestrePt;
    }

    public void setMediaBimestrePt(double mediaBimestrePt) {
        this.mediaBimestrePt = mediaBimestrePt;
    }

    public double getNotaFinalPt() {
        return notaFinalPt;
    }

    public void setNotaFinalPt(double notaFinalPt) {
        this.notaFinalPt = notaFinalPt;
    }

    public double getMediaAnualPt() {
        return mediaAnualPt;
    }

    public void setMediaAnualPt(double mediaAnualPt) {
        this.mediaAnualPt = mediaAnualPt;
    }

    public double getNotaBimestre1Mt() {
        return notaBimestre1Mt;
    }

    public void setNotaBimestre1Mt(double notaBimestre1Mt) {
        this.notaBimestre1Mt = notaBimestre1Mt;
    }

    public double getNotaBimestre2Mt() {
        return notaBimestre2Mt;
    }

    public void setNotaBimestre2Mt(double notaBimestre2Mt) {
        this.notaBimestre2Mt = notaBimestre2Mt;
    }

    public double getNotaBimestre3Mt() {
        return notaBimestre3Mt;
    }

    public void setNotaBimestre3Mt(double notaBimestre3Mt) {
        this.notaBimestre3Mt = notaBimestre3Mt;
    }

    public double getNotaBimestre4Mt() {
        return notaBimestre4Mt;
    }

    public void setNotaBimestre4Mt(double notaBimestre4Mt) {
        this.notaBimestre4Mt = notaBimestre4Mt;
    }

    public double getNotaRecuperacaoMt() {
        return notaRecuperacaoMt;
    }

    public void setNotaRecuperacaoMt(double notaRecuperacaoMt) {
        this.notaRecuperacaoMt = notaRecuperacaoMt;
    }

    public double getMediaBimestreMt() {
        return mediaBimestreMt;
    }

    public void setMediaBimestreMt(double mediaBimestreMt) {
        this.mediaBimestreMt = mediaBimestreMt;
    }

    public double getNotaFinalMt() {
        return notaFinalMt;
    }

    public void setNotaFinalMt(double notaFinalMt) {
        this.notaFinalMt = notaFinalMt;
    }

    public double getMediaAnualMt() {
        return mediaAnualMt;
    }

    public void setMediaAnualMt(double mediaAnualMt) {
        this.mediaAnualMt = mediaAnualMt;
    }

    public double getNotaBimestre1Ci() {
        return notaBimestre1Ci;
    }

    public void setNotaBimestre1Ci(double notaBimestre1Ci) {
        this.notaBimestre1Ci = notaBimestre1Ci;
    }

    public double getNotaBimestre2Ci() {
        return notaBimestre2Ci;
    }

    public void setNotaBimestre2Ci(double notaBimestre2Ci) {
        this.notaBimestre2Ci = notaBimestre2Ci;
    }

    public double getNotaBimestre3Ci() {
        return notaBimestre3Ci;
    }

    public void setNotaBimestre3Ci(double notaBimestre3Ci) {
        this.notaBimestre3Ci = notaBimestre3Ci;
    }

    public double getNotaBimestre4Ci() {
        return notaBimestre4Ci;
    }

    public void setNotaBimestre4Ci(double notaBimestre4Ci) {
        this.notaBimestre4Ci = notaBimestre4Ci;
    }

    public double getNotaRecuperacaoCi() {
        return notaRecuperacaoCi;
    }

    public void setNotaRecuperacaoCi(double notaRecuperacaoCi) {
        this.notaRecuperacaoCi = notaRecuperacaoCi;
    }

    public double getMediaBimestreCi() {
        return mediaBimestreCi;
    }

    public void setMediaBimestreCi(double mediaBimestreCi) {
        this.mediaBimestreCi = mediaBimestreCi;
    }

    public double getNotaFinalCi() {
        return notaFinalCi;
    }

    public void setNotaFinalCi(double notaFinalCi) {
        this.notaFinalCi = notaFinalCi;
    }

    public double getMediaAnualCi() {
        return mediaAnualCi;
    }

    public void setMediaAnualCi(double mediaAnualCi) {
        this.mediaAnualCi = mediaAnualCi;
    }

    public double getNotaBimestre1Hs() {
        return notaBimestre1Hs;
    }

    public void setNotaBimestre1Hs(double notaBimestre1Hs) {
        this.notaBimestre1Hs = notaBimestre1Hs;
    }

    public double getNotaBimestre2Hs() {
        return notaBimestre2Hs;
    }

    public void setNotaBimestre2Hs(double notaBimestre2Hs) {
        this.notaBimestre2Hs = notaBimestre2Hs;
    }

    public double getNotaBimestre3Hs() {
        return notaBimestre3Hs;
    }

    public void setNotaBimestre3Hs(double notaBimestre3Hs) {
        this.notaBimestre3Hs = notaBimestre3Hs;
    }

    public double getNotaBimestre4Hs() {
        return notaBimestre4Hs;
    }

    public void setNotaBimestre4Hs(double notaBimestre4Hs) {
        this.notaBimestre4Hs = notaBimestre4Hs;
    }

    public double getNotaRecuperacaoHs() {
        return notaRecuperacaoHs;
    }

    public void setNotaRecuperacaoHs(double notaRecuperacaoHs) {
        this.notaRecuperacaoHs = notaRecuperacaoHs;
    }

    public double getMediaBimestreHs() {
        return mediaBimestreHs;
    }

    public void setMediaBimestreHs(double mediaBimestreHs) {
        this.mediaBimestreHs = mediaBimestreHs;
    }

    public double getNotaFinalHs() {
        return notaFinalHs;
    }

    public void setNotaFinalHs(double notaFinalHs) {
        this.notaFinalHs = notaFinalHs;
    }

    public double getMediaAnualHs() {
        return mediaAnualHs;
    }

    public void setMediaAnualHs(double mediaAnualHs) {
        this.mediaAnualHs = mediaAnualHs;
    }

    public double getNotaBimestre1Ge() {
        return notaBimestre1Ge;
    }

    public void setNotaBimestre1Ge(double notaBimestre1Ge) {
        this.notaBimestre1Ge = notaBimestre1Ge;
    }

    public double getNotaBimestre2Ge() {
        return notaBimestre2Ge;
    }

    public void setNotaBimestre2Ge(double notaBimestre2Ge) {
        this.notaBimestre2Ge = notaBimestre2Ge;
    }

    public double getNotaBimestre3Ge() {
        return notaBimestre3Ge;
    }

    public void setNotaBimestre3Ge(double notaBimestre3Ge) {
        this.notaBimestre3Ge = notaBimestre3Ge;
    }

    public double getNotaBimestre4Ge() {
        return notaBimestre4Ge;
    }

    public void setNotaBimestre4Ge(double notaBimestre4Ge) {
        this.notaBimestre4Ge = notaBimestre4Ge;
    }

    public double getNotaRecuperacaoGe() {
        return notaRecuperacaoGe;
    }

    public void setNotaRecuperacaoGe(double notaRecuperacaoGe) {
        this.notaRecuperacaoGe = notaRecuperacaoGe;
    }

    public double getMediaBimestreGe() {
        return mediaBimestreGe;
    }

    public void setMediaBimestreGe(double mediaBimestreGe) {
        this.mediaBimestreGe = mediaBimestreGe;
    }

    public double getNotaFinalGe() {
        return notaFinalGe;
    }

    public void setNotaFinalGe(double notaFinalGe) {
        this.notaFinalGe = notaFinalGe;
    }

    public double getMediaAnualGe() {
        return mediaAnualGe;
    }

    public void setMediaAnualGe(double mediaAnualGe) {
        this.mediaAnualGe = mediaAnualGe;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nome);
        parcel.writeString(turma);
        parcel.writeString(disciplina1);
        parcel.writeString(disciplina2);
        parcel.writeString(disciplina3);
        parcel.writeString(disciplina4);
        parcel.writeString(disciplina5);
        parcel.writeDouble(notaBimestre1Pt);
        parcel.writeDouble(notaBimestre2Pt);
        parcel.writeDouble(notaBimestre3Pt);
        parcel.writeDouble(notaBimestre4Pt);
        parcel.writeDouble(notaRecuperacaoPt);
        parcel.writeDouble(mediaBimestrePt);
        parcel.writeDouble(notaFinalPt);
        parcel.writeDouble(mediaAnualPt);
        parcel.writeDouble(notaBimestre1Mt);
        parcel.writeDouble(notaBimestre2Mt);
        parcel.writeDouble(notaBimestre3Mt);
        parcel.writeDouble(notaBimestre4Mt);
        parcel.writeDouble(notaRecuperacaoMt);
        parcel.writeDouble(mediaBimestreMt);
        parcel.writeDouble(notaFinalMt);
        parcel.writeDouble(mediaAnualMt);
        parcel.writeDouble(notaBimestre1Ci);
        parcel.writeDouble(notaBimestre2Ci);
        parcel.writeDouble(notaBimestre3Ci);
        parcel.writeDouble(notaBimestre4Ci);
        parcel.writeDouble(notaRecuperacaoCi);
        parcel.writeDouble(mediaBimestreCi);
        parcel.writeDouble(notaFinalCi);
        parcel.writeDouble(mediaAnualCi);
        parcel.writeDouble(notaBimestre1Hs);
        parcel.writeDouble(notaBimestre2Hs);
        parcel.writeDouble(notaBimestre3Hs);
        parcel.writeDouble(notaBimestre4Hs);
        parcel.writeDouble(notaRecuperacaoHs);
        parcel.writeDouble(mediaBimestreHs);
        parcel.writeDouble(notaFinalHs);
        parcel.writeDouble(mediaAnualHs);
        parcel.writeDouble(notaBimestre1Ge);
        parcel.writeDouble(notaBimestre2Ge);
        parcel.writeDouble(notaBimestre3Ge);
        parcel.writeDouble(notaBimestre4Ge);
        parcel.writeDouble(notaRecuperacaoGe);
        parcel.writeDouble(mediaBimestreGe);
        parcel.writeDouble(notaFinalGe);
        parcel.writeDouble(mediaAnualGe);
    }
}
