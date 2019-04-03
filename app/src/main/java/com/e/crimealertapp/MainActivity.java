package com.e.crimealertapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 }


    public void clickMe(View view){
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
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
