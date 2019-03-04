package com.e.crimealertapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Name:    ADEBUGA AMIDU
//        RegNo:   2017/BIT/170
//        Course:  MOBILE PROGRAMMING
//        LECTURER: KIMERA RICHARD
    }
    public void clickMe(View view){
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "the app is Pause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, " Welcome report crime app", Toast.LENGTH_SHORT).show();
      }

    @Override
    protected void onDestroy() {
        super.onDestroy();
          }
}
