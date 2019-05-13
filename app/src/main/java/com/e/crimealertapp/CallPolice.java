package com.e.crimealertapp;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CallPolice extends Fragment {
    private static final int REQUEST_CALL = 1;
    private EditText mEdittextNumber;
    private View parentView;
    Button btn;


    public CallPolice(){

    }

    public static CallPolice instance(){
        CallPolice fragment  = new CallPolice();
        //fragment.setArguments(new Bundle().putInt("FragArg"););

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       parentView = inflater.inflate(R.layout.callpolice_fragment,container,false);
        setUpViews();
        return parentView;
    }

    private void setUpViews() {
        parentView.findViewById(R.id.image_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                alertDialog.setTitle("Do you want to call?");
                alertDialog.setMessage("100");
                alertDialog.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // Write your code here to execute after dialog
                                dialog.cancel();

                            }
                        });
                alertDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // Write your code here to execute after dialog
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:100"));
                                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(callIntent);

                            }
                        });
                // Showing Alert Message
                alertDialog.show();
            }
        });

    }


}

