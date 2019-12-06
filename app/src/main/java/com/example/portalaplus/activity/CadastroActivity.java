package com.example.portalaplus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.portalaplus.R;
import com.example.portalaplus.helper.ConfiguracaoFirebase;
import com.example.portalaplus.model.Responsavel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

public class CadastroActivity extends AppCompatActivity {

    private EditText nomeInst, emailInst, senhaInst;
    private Button cadastrar;
    private TextView voltarLogin;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

        inicializarComponentes();

        voltarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void inicializarComponentes(){
        nomeInst = findViewById(R.id.editCadastroNomeInstituicao);
        emailInst = findViewById(R.id.editCadastroEmail);
        senhaInst = findViewById(R.id.editCadastroSenha);
        cadastrar = findViewById(R.id.buttonCadastroLogar);
        voltarLogin = findViewById(R.id.textViewVoltarParaLogin);
    }

    public void cadastrarResponsavel(View view){
        if (nomeInst.getText() != null){
            if (emailInst.getText() != null){
                if (senhaInst.getText() != null){

                    Responsavel responsavel = new Responsavel();
                    responsavel.setNome(nomeInst.getText().toString());
                    responsavel.setEmail(emailInst.getText().toString());
                    responsavel.setSenha(senhaInst.getText().toString());

                    Intent intent = new Intent(CadastroActivity.this, MenuActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }
    }
}
