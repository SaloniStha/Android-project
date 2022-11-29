package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin,btnSignup ;
    private EditText etUsername,etPassword;
    private String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"please enter detail",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSignup = findViewById(R.id.btnSignup);
                btnSignup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                        startActivity(intent);
                    }
                });
    }
    private boolean validate(){
        username = etUsername.getText().toString();
        password = etPassword.getText().toString();
        if(username.isEmpty()){
            etUsername.setError("Username can not be blank");
            return false;}
        if(password.isEmpty()){
            etPassword.setError("Password can not be blank");
            return false;}
        return true;
    }
}