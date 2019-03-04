package com.e.crimealertapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Dashboard extends AppCompatActivity {

Button button;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("First Activity");
        menu.add("Second Activity");
        menu.add("third activity");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected "+item.getTitle(), Toast.LENGTH_SHORT).show();

        if(item.getTitle().toString().equals("Second Activity")){
            Toast.makeText(this, "Your already in the Second Activity", Toast.LENGTH_SHORT).show();

        }
        else if(item.getTitle().toString().equals("First Activity")){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if(item.getTitle().toString().equals("third activity")){
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }
        return super.onContextItemSelected(item);


    }



    Button report;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        button = findViewById(R.id.nav);
        registerForContextMenu(button);
    }
    public void report(View view){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

}
