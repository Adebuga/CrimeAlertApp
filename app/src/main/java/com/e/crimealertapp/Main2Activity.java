package com.e.crimealertapp;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navlistner);

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
            case R.id.layout:
            case R.id.langua:
            case R.id.conn:
                Intent intent = new Intent(getApplicationContext(),BroadConnection.class);
                startActivity(intent);




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
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, SelectedFragment).commit();
                return true;
            }
        };
    }


}
