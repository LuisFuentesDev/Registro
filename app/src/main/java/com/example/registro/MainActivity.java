package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.textName.getText().toString();
                String lastName = binding.textLastName.getText().toString();
                String email = binding.textEmail.getText().toString();
                String password = binding.textPassword.getText().toString();

                String text = "Usuario: " + name + " " + lastName + " Email: " + email + " Contraseña: " + password;

                if (name.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || !email.contains("@")) {
                    Toast.makeText(getBaseContext(), "Faltan datos por ingresar", Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();

            }
        });
    }
}