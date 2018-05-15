package com.example.lawrence.fju_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button etbutton = (Button) findViewById(R.id.button);
        final TextView etText = (TextView) findViewById(R.id.etText);

        etbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(etName.getText().toString(), etPassword.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){

        if(userName.equals("401234567") && userPassword.equals("123456") ){

            Intent intent1 = new Intent(LoginActivity.this, StudentActivity.class);
            startActivity(intent1);
        }else if(userName.equals("100086") && userPassword.equals("654321")){
            Intent intent2 = new Intent(LoginActivity.this, NoticeActivity.class);
            startActivity(intent2);
        }
        else{
            openDialog();
        }
    }
    public void openDialog(){
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}


