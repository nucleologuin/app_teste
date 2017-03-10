package com.example.root.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText txtPwd,txtLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (EditText) findViewById(R.id.txtLogin);
        txtPwd = (EditText) findViewById(R.id.txtPwd);

    }

    public void logar(View v) {

        if (txtLogin.getText().toString().equals("admin") && txtPwd.getText().toString().equals("123")) {
            Intent intent = new Intent(MainActivity.this, Tela_principal.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Login e/ou senha incorretos", Toast.LENGTH_SHORT).show();
            txtLogin.setText("");
            txtPwd.setText("");
        }
    }

}

