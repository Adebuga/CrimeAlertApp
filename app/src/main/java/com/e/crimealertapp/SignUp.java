package com.e.crimealertapp;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    MyDatabaseHelper db;
    EditText e1,e2,e3,e4;
    Button b1, b2;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("wait nigah......");

        db = new MyDatabaseHelper(this);

        e1= (EditText)findViewById(R.id.Email);
        e2= (EditText)findViewById(R.id.pass);
        e3= (EditText)findViewById(R.id.cpass);
        e4= (EditText)findViewById(R.id.phone);

        b1 = (Button)findViewById(R.id.register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                if (s1.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Email field is empty",Toast.LENGTH_SHORT).show();
                }
                else if (s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"password field is empty",Toast.LENGTH_SHORT).show();
                }
                else if(s3.equals("")){
                    Toast.makeText(getApplicationContext(),"password field is empty",Toast.LENGTH_SHORT).show();
                }
                else if(s4.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"password field is empty",Toast.LENGTH_SHORT).show();
                }
                else  {
                    if (s2.equals(s3))
                    {
                        Boolean CheckMail = db.CheckMail(s1);
                        if (CheckMail== true)
                        {
                            Boolean insert = db.insert(s1,s2,s4);
                           if (insert==true){
                                Toast.makeText(getApplicationContext(),"Registered successful",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),LogInForm.class);
                                startActivity(intent);
                               progressDialog.setTitle("loading");
                               progressDialog.show();
                                progressDialog.setCancelable(false);
                                progressDialog.hide();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Email already exits",Toast.LENGTH_SHORT).show();
                              progressDialog.setTitle("loading");
                              progressDialog.show();


                        }

                    }
                    Toast.makeText(getApplicationContext()," No matched password",Toast.LENGTH_SHORT).show();


                }

            }

        });

    }

    public void toLogin(View view) {
        Intent intent = new Intent(getApplicationContext(),LogInForm.class);
        startActivity(intent);
    }
}
