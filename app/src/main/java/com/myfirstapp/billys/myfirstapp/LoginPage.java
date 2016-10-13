package com.myfirstapp.billys.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity implements View.OnClickListener
{
    Button Login;
    EditText User;
    EditText Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Login = (Button) findViewById(R.id.btnLogin);
        User = (EditText) findViewById(R.id.editTextUser);
        Pass = (EditText) findViewById(R.id.editTextPass);

        User.getText();
        Pass.getText();

        Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnLogin:
            {
                if (User.getText().toString().equals("admin") && Pass.getText().toString().equals("admin"))
                {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(LoginPage.this).create();
                    alertDialog.setTitle("Login Fehler");
                    alertDialog.show();

                }
                break;
            }
        }
    }

}
