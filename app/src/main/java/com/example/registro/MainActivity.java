package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textLastName;
        EditText textEmail;
        EditText textPassword;

        textName = findViewById(R.id.textName);
        textLastName = findViewById(R.id.textLastName);
        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);

        Button buttonCreate = findViewById(R.id.buttonCreateAccount);

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String email = textEmail.getText().toString();
                String password = textPassword.getText().toString();

                String text = "Usuario: " + name + " " + lastName + " Email: " + email + " Contraseña: " + password;

                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || !email.contains("@")){
                    Toast.makeText(getBaseContext(), "Faltan datos por ingresar", Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();

            }
        });
    }
}