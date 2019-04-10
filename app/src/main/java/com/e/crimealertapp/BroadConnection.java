package com.e.crimealertapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BroadConnection extends AppCompatActivity {
    ImageView connimage;
    TextView conTex;
    Button conBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_connection);
//lnking views to xml
        conBtn = findViewById(R.id.conbtn);
        connimage = findViewById(R.id.conImage);
        conTex = findViewById(R.id.cntxt);
        //add listener on the button
        conBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connection();
            }
        });

    }
    public void connection(){
        boolean wificonnection;
        boolean mobiledata;
        boolean ethernet;

        ConnectivityManager conn =(ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo Active = conn.getActiveNetworkInfo();

        if (Active != null && Active.isConnected()){
             wificonnection= Active.getType()==ConnectivityManager.TYPE_WIFI;
             mobiledata = Active.getType() == ConnectivityManager.TYPE_MOBILE;
            ethernet = Active.getType() == ConnectivityManager.TYPE_ETHERNET;
              if (wificonnection){
                  connimage.setImageResource(R.drawable.ic_action_wifi);
                  conTex.setText("Wifi Connected");
              }
              else if (mobiledata)
              {
                  connimage.setImageResource(R.drawable.ic_action_mobile);
                  conTex.setText("You are connected to mobile data");

              }
              else if (ethernet)
              {
                  connimage.setImageResource(R.drawable.ic_action_ehternet);
                  conTex.setText("You are using ethernet");

              }
        }
        else {
            connimage.setImageResource(R.drawable.ic_action_no);
            conTex.setText("No internet Connection!");

        }
    }

}
