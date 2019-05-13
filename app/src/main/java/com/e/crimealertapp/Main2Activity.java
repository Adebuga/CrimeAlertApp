package com.e.crimealertapp;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button b2;
    HomeFragmentDatabse db;
    EditText e1,e2,e3,e4,e5,e6,e7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navlistner);
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new ReportFragment()).commit();


        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE )
                != PackageManager.PERMISSION_GRANTED){
            getpermission();
        }


    }
    private void getpermission()
    {
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
//                Intent in= new Intent(getApplicationContext(),LogInForm.class);
//                startActivity(in);

                break;
            case R.id.layout:
                Intent exit = new Intent();
                break;
            case R.id.conn:
                Intent intent = new Intent(getApplicationContext(),BroadConnection.class);
                startActivity(intent);
                break;
            case R.id.web:
                Intent inten = new Intent(getApplicationContext(),MywebView.class);
                startActivity(inten);
                break;





        }
        return super.onOptionsItemSelected(item);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistner;

    {
        navlistner = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment SelectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.report_nav:
                        SelectedFragment = ReportFragment.instance();
                        
                        break;
                    case R.id.nav_history:
                        SelectedFragment = HistoryFragment.instance();
                        break;
                    case R.id.nav_call:
                        SelectedFragment = CallPolice.instance();
                        break;
                        default:
                            SelectedFragment = new ReportFragment();
                            break;

                }
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.frag_container, SelectedFragment).commit();
                return true;
            }
        };
    }


}
