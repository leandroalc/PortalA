package com.example.portalaplus.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.portalaplus.R;
import com.example.portalaplus.model.Aluno;

public class NotaActivity extends AppCompatActivity {

    private TextView notaBimestre1Pt, notaBimestre2Pt, notaBimestre3Pt, notaBimestre4Pt, notaRecuperacaoPt, mediaBimestrePt, notaFinalPt, mediaAnualPt;
    private TextView notaBimestre1Mt, notaBimestre2Mt, notaBimestre3Mt, notaBimestre4Mt, notaRecuperacaoMt, mediaBimestreMt, notaFinalMt, mediaAnualMt;
    private TextView notaBimestre1Ci, notaBimestre2Ci, notaBimestre3Ci, notaBimestre4Ci, notaRecuperacaoCi, mediaBimestreCi, notaFinalCi, mediaAnualCi;
    private TextView notaBimestre1Hs, notaBimestre2Hs, notaBimestre3Hs, notaBimestre4Hs, notaRecuperacaoHs, mediaBimestreHs, notaFinalHs, mediaAnualHs;
    private TextView notaBimestre1Ge, notaBimestre2Ge, notaBimestre3Ge, notaBimestre4Ge, notaRecuperacaoGe, mediaBimestreGe, notaFinalGe, mediaAnualGe;

    private TextView labelnotaBimestre1Pt, labelnotaBimestre2Pt, labelnotaBimestre3Pt, labelnotaBimestre4Pt, labelnotaRecuperacaoPt, labelmediaBimestrePt, labelnotaFinalPt, labelmediaAnualPt;
    private TextView labelnotaBimestre1Mt, labelnotaBimestre2Mt, labelnotaBimestre3Mt, labelnotaBimestre4Mt, labelnotaRecuperacaoMt, labelmediaBimestreMt, labelnotaFinalMt, labelmediaAnualMt;
    private TextView labelnotaBimestre1Ci, labelnotaBimestre2Ci, labelnotaBimestre3Ci, labelnotaBimestre4Ci, labelnotaRecuperacaoCi, labelmediaBimestreCi, labelnotaFinalCi, labelmediaAnualCi;
    private TextView labelnotaBimestre1Hs, labelnotaBimestre2Hs, labelnotaBimestre3Hs, labelnotaBimestre4Hs, labelnotaRecuperacaoHs, labelmediaBimestreHs, labelnotaFinalHs, labelmediaAnualHs;
    private TextView labelnotaBimestre1Ge, labelnotaBimestre2Ge, labelnotaBimestre3Ge, labelnotaBimestre4Ge, labelnotaRecuperacaoGe, labelmediaBimestreGe, labelnotaFinalGe, labelmediaAnualGe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        inicializarComponentesExibicao();

        inicializarComponentesLabel();

        carregaCamposExibicao();

        carregaCamposLabel();

    }

    private void inicializarComponentesExibicao() {
        notaBimestre1Pt = findViewById(R.id.textViewExibePrimeiroPt);
        notaBimestre2Pt = findViewById(R.id.textViewExibeSegundoPt);
        notaBimestre3Pt = findViewById(R.id.textViewExibeTerceiroPt);
        notaBimestre4Pt = findViewById(R.id.textViewExibeQuartoPt);
        notaRecuperacaoPt = findViewById(R.id.textViewExibeRecuperacaoPt);
        mediaBimestrePt = findViewById(R.id.textViewExibeMediaBimestrePt);
        notaFinalPt = findViewById(R.id.textViewExibeFinalPt);
        mediaAnualPt = findViewById(R.id.textViewExibeAnualPt);
        notaBimestre1Mt = findViewById(R.id.textViewExibePrimeiroMt);
        notaBimestre2Mt = findViewById(R.id.textViewExibePrimeiroMt);
        notaBimestre3Mt = findViewById(R.id.textViewExibePrimeiroMt);
        notaBimestre4Mt = findViewById(R.id.textViewExibePrimeiroMt);
        notaRecuperacaoMt = findViewById(R.id.textViewExibePrimeiroMt);
        mediaBimestreMt = findViewById(R.id.textViewExibePrimeiroMt);
        notaFinalMt = findViewById(R.id.textViewExibePrimeiroMt);
        mediaAnualMt = findViewById(R.id.textViewExibePrimeiroMt);
        notaBimestre1Ci = findViewById(R.id.textViewExibePrimeiroCi);
        notaBimestre2Ci = findViewById(R.id.textViewExibePrimeiroCi);
        notaBimestre3Ci = findViewById(R.id.textViewExibePrimeiroCi);
        notaBimestre4Ci = findViewById(R.id.textViewExibePrimeiroCi);
        notaRecuperacaoCi = findViewById(R.id.textViewExibePrimeiroCi);
        mediaBimestreCi = findViewById(R.id.textViewExibePrimeiroCi);
        notaFinalCi = findViewById(R.id.textViewExibePrimeiroCi);
        mediaAnualCi = findViewById(R.id.textViewExibePrimeiroCi);
        notaBimestre1Hs = findViewById(R.id.textViewExibePrimeiroHs);
        notaBimestre2Hs = findViewById(R.id.textViewExibePrimeiroHs);
        notaBimestre3Hs = findViewById(R.id.textViewExibePrimeiroHs);
        notaBimestre4Hs = findViewById(R.id.textViewExibePrimeiroHs);
        notaRecuperacaoHs = findViewById(R.id.textViewExibePrimeiroHs);
        mediaBimestreHs = findViewById(R.id.textViewExibePrimeiroHs);
        notaFinalHs = findViewById(R.id.textViewExibePrimeiroHs);
        mediaAnualHs = findViewById(R.id.textViewExibePrimeiroHs);
        notaBimestre1Ge = findViewById(R.id.textViewExibePrimeiroGe);
        notaBimestre2Ge = findViewById(R.id.textViewExibePrimeiroGe);
        notaBimestre3Ge = findViewById(R.id.textViewExibePrimeiroGe);
        notaBimestre4Ge = findViewById(R.id.textViewExibePrimeiroGe);
        notaRecuperacaoGe = findViewById(R.id.textViewExibePrimeiroGe);
        mediaBimestreGe = findViewById(R.id.textViewExibePrimeiroGe);
        notaFinalGe = findViewById(R.id.textViewExibePrimeiroGe);
        mediaAnualGe = findViewById(R.id.textViewExibePrimeiroGe);
    }

    private void inicializarComponentesLabel() {
        labelnotaBimestre1Pt = findViewById(R.id.textViewLabelPrimeiroPt);
        labelnotaBimestre2Pt = findViewById(R.id.textViewLabelSegundoPt);
        labelnotaBimestre3Pt = findViewById(R.id.textViewLabelTerceiroPt);
        labelnotaBimestre4Pt = findViewById(R.id.textViewLabelQuartoPt);
        labelnotaRecuperacaoPt = findViewById(R.id.textViewLabelRecuperacaoPt);
        labelmediaBimestrePt = findViewById(R.id.textViewLabelMediaBimestrePt);
        labelnotaFinalPt = findViewById(R.id.textViewLabelFinalPt);
        labelmediaAnualPt = findViewById(R.id.textViewLabelAnualPt);
        labelnotaBimestre1Mt = findViewById(R.id.textViewLabelPrimeiroMt);
        labelnotaBimestre2Mt = findViewById(R.id.textViewLabelSegundoMt);
        labelnotaBimestre3Mt = findViewById(R.id.textViewLabelTerceiroMt);
        labelnotaBimestre4Mt = findViewById(R.id.textViewLabelQuartoMt);
        labelnotaRecuperacaoMt = findViewById(R.id.textViewLabelRecuperacaoMt);
        labelmediaBimestreMt = findViewById(R.id.textViewLabelMediaBimestreMt);
        labelnotaFinalMt = findViewById(R.id.textViewLabelFinalMt);
        labelmediaAnualMt = findViewById(R.id.textViewLabelAnualMt);
        labelnotaBimestre1Ci = findViewById(R.id.textViewLabelPrimeiroCi);
        labelnotaBimestre2Ci = findViewById(R.id.textViewLabelSegundoCi);
        labelnotaBimestre3Ci = findViewById(R.id.textViewLabelTerceiroCi);
        labelnotaBimestre4Ci = findViewById(R.id.textViewLabelQuartoCi);
        labelnotaRecuperacaoCi = findViewById(R.id.textViewLabelRecuperacaoCi);
        labelmediaBimestreCi = findViewById(R.id.textViewLabelMediaBimestreCi);
        labelnotaFinalCi = findViewById(R.id.textViewLabelFinalCi);
        labelmediaAnualCi = findViewById(R.id.textViewLabelAnualCi);
        labelnotaBimestre1Hs = findViewById(R.id.textViewLabelPrimeiroHs);
        labelnotaBimestre2Hs = findViewById(R.id.textViewLabelSegundoHs);
        labelnotaBimestre3Hs = findViewById(R.id.textViewLabelTerceiroHs);
        labelnotaBimestre4Hs = findViewById(R.id.textViewLabelQuartoHs);
        labelnotaRecuperacaoHs = findViewById(R.id.textViewLabelRecuperacaoHs);
        labelmediaBimestreHs = findViewById(R.id.textViewLabelMediaBimestreHs);
        labelnotaFinalHs = findViewById(R.id.textViewLabelFinalHs);
        labelmediaAnualHs = findViewById(R.id.textViewLabelAnualHs);
        labelnotaBimestre1Ge = findViewById(R.id.textViewLabelPrimeiroGe);
        labelnotaBimestre2Ge = findViewById(R.id.textViewLabelSegundoGe);
        labelnotaBimestre3Ge = findViewById(R.id.textViewLabelTerceiroGe);
        labelnotaBimestre4Ge = findViewById(R.id.textViewLabelQuartoGe);
        labelnotaRecuperacaoGe = findViewById(R.id.textViewLabelRecuperacaoGe);
        labelmediaBimestreGe = findViewById(R.id.textViewLabelMediaBimestreGe);
        labelnotaFinalGe = findViewById(R.id.textViewLabelFinalGe);
        labelmediaAnualGe = findViewById(R.id.textViewLabelAnualGe);
    }

    public void carregaCamposExibicao() {
        notaBimestre1Pt.getText();
        notaBimestre2Pt.getText();
        notaBimestre3Pt.getText();
        notaBimestre4Pt.getText();
        notaRecuperacaoPt.getText();
        mediaBimestrePt.getText();
        notaFinalPt.getText();
        mediaAnualPt.getText();
        notaBimestre1Mt.getText();
        notaBimestre2Mt.getText();
        notaBimestre3Mt.getText();
        notaBimestre4Mt.getText();
        notaRecuperacaoMt.getText();
        mediaBimestreMt.getText();
        notaFinalMt.getText();
        mediaAnualMt.getText();
        notaBimestre1Ci.getText();
        notaBimestre2Ci.getText();
        notaBimestre3Ci.getText();
        notaBimestre4Ci.getText();
        notaRecuperacaoCi.getText();
        mediaBimestreCi.getText();
        notaFinalCi.getText();
        mediaAnualCi.getText();
        notaBimestre1Hs.getText();
        notaBimestre2Hs.getText();
        notaBimestre3Hs.getText();
        notaBimestre4Hs.getText();
        notaRecuperacaoHs.getText();
        mediaBimestreHs.getText();
        notaFinalHs.getText();
        mediaAnualHs.getText();
        notaBimestre1Ge.getText();
        notaBimestre2Ge.getText();
        notaBimestre3Ge.getText();
        notaBimestre4Ge.getText();
        notaRecuperacaoGe.getText();
        mediaBimestreGe.getText();
        notaFinalGe.getText();
        mediaAnualGe.getText();
    }

    public void carregaCamposLabel() {
        labelnotaBimestre1Pt.getText();
        labelnotaBimestre2Pt.getText();
        labelnotaBimestre3Pt.getText();
        labelnotaBimestre4Pt.getText();
        labelnotaRecuperacaoPt.getText();
        labelmediaBimestrePt.getText();
        labelnotaFinalPt.getText();
        labelmediaAnualPt.getText();
        labelnotaBimestre1Mt.getText();
        labelnotaBimestre2Mt.getText();
        labelnotaBimestre3Mt.getText();
        labelnotaBimestre4Mt.getText();
        labelnotaRecuperacaoMt.getText();
        labelmediaBimestreMt.getText();
        labelnotaFinalMt.getText();
        labelmediaAnualMt.getText();
        labelnotaBimestre1Ci.getText();
        labelnotaBimestre2Ci.getText();
        labelnotaBimestre3Ci.getText();
        labelnotaBimestre4Ci.getText();
        labelnotaRecuperacaoCi.getText();
        labelmediaBimestreCi.getText();
        labelnotaFinalCi.getText();
        labelmediaAnualCi.getText();
        labelnotaBimestre1Hs.getText();
        labelnotaBimestre2Hs.getText();
        labelnotaBimestre3Hs.getText();
        labelnotaBimestre4Hs.getText();
        labelnotaRecuperacaoHs.getText();
        labelmediaBimestreHs.getText();
        labelnotaFinalHs.getText();
        labelmediaAnualHs.getText();
        labelnotaBimestre1Ge.getText();
        labelnotaBimestre2Ge.getText();
        labelnotaBimestre3Ge.getText();
        labelnotaBimestre4Ge.getText();
        labelnotaRecuperacaoGe.getText();
        labelmediaBimestreGe.getText();
        labelnotaFinalGe.getText();
        labelmediaAnualGe.getText();
    }

}
