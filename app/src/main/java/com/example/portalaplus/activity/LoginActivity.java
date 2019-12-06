package com.example.portalaplus.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
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
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail, loginSenha;
    private Switch tipoAcesso;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicializarComponentes();

        auth = ConfiguracaoFirebase.getFirebaseAuth();

    }

    private void inicializarComponentes(){
        loginEmail = findViewById(R.id.editLoginEmail);
        loginSenha = findViewById(R.id.editLoginSenha);
        tipoAcesso = findViewById(R.id.switchLogar);
    }

    public void logarUsuario(View view) {
        if (loginEmail.getText() != null){
            if (loginSenha.getText() != null){
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }

}
