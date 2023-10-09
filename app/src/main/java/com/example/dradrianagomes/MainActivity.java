package com.example.dradrianagomes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAgendar = findViewById(R.id.buttonSignUp);
        buttonAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, agendar.class);
                startActivity(intent);
            }
        });

        Button buttonCadastro = findViewById(R.id.buttonSignUp);
        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cadastro.class);
                startActivity(intent);
            }
        });

        Button buttonSemLogin = findViewById(R.id.buttonContinueWithoutLogin);
        buttonSemLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SemLogin.class);
                startActivity(intent);
            }
        });

        Button buttonEntrar = findViewById(R.id.buttonLogin);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextEmail = findViewById(R.id.editTextEmail);
                EditText editTextSenha = findViewById(R.id.editTextPassword);

                String email = editTextEmail.getText().toString();
                String senha = editTextSenha.getText().toString();

                if (email.isEmpty() || senha.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o e-mail e a senha", Toast.LENGTH_SHORT).show();
                } else {


                    if (efetuarLogin(email, senha)) {

                        Intent intent = new Intent(MainActivity.this, entrar.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Login falhou. Verifique suas credenciais.", Toast.LENGTH_SHORT).show();


                    }
                }
            }


            private boolean efetuarLogin(String email, String senha) {

                return email.equals("a") && senha.equals("a123");
            }
        });
    }
}
