package com.example.dradrianagomes;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

    public class cadastro extends AppCompatActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.cadastro);

                EditText editTextNome = findViewById(R.id.editTextNome);
                EditText editTextSobrenome = findViewById(R.id.editTextSobrenome);

            }
        }


