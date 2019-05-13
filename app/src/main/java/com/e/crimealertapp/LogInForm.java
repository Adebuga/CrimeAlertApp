package com.e.crimealertapp;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LogInForm extends AppCompatActivity {

    //UI references
    MyDatabaseHelper db;
    EditText e1,e2;
    ImageButton b2;
    private CheckBox checkBoxRememberMe;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_form);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait......");

        db = new MyDatabaseHelper(this);
        e1= (EditText)findViewById(R.id.email);
        e2= (EditText)findViewById(R.id.pass);

        b2=(ImageButton)findViewById(R.id.loginBtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email  = e1.getText().toString();
                String password = e2.getText().toString();
                if (email.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Email field is empty",Toast.LENGTH_SHORT).show();
                }
                else if (password.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"password field is empty",Toast.LENGTH_SHORT).show();
                }

                Boolean check = db.checkPassAndEmail(email,password);
                 if (check==true)
                {
                    Intent i  = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login successfully",Toast.LENGTH_SHORT).show();
                    progressDialog.setTitle("loading");
                    progressDialog.show();
                }else
                     Toast.makeText(getApplicationContext(), "Wrong details entered!!!", Toast.LENGTH_SHORT).show();

            }

        });

    }

    public void toLogin(View view) {
        Intent intent = new Intent(getApplicationContext(),SignUp.class);
        startActivity(intent);

    }
}
