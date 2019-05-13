package com.e.crimealertapp;
import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo;
import android.service.notification.Condition;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity  {

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Please wait......");
//        progressDialog.setTitle("loading");
//        progressDialog.show();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
        != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_PHONE_STATE},1);

            if(cheConnection())
            {
                Toast.makeText(this, "connected", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Not connected", Toast.LENGTH_SHORT).show();
            }
        }

 }
 private boolean cheConnection(){
     ConnectivityManager connectivityManager = (ConnectivityManager)
             getSystemService(Context.CONNECTIVITY_SERVICE);
     NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
     return activeNetworkInfo != null && activeNetworkInfo.isConnected();

 }

    public void clickMe(View view){
        Intent intent = new Intent(getApplicationContext(),LogInForm.class);
        startActivity(intent);
    }
    @Override
    protected void onPause() {
        super.onPause();


    }
    @Override
    protected void onStart() {
        super.onStart();
      }

    @Override
    protected void onDestroy() {
        super.onDestroy();
          }
          
}

