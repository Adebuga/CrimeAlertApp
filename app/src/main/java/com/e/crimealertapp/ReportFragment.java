package com.e.crimealertapp;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReportFragment extends Fragment {

    HomeFragmentDatabse db;
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b2;

    public ReportFragment(){

    }
    public static ReportFragment instance(){
        ReportFragment fragment  = new ReportFragment();
        //fragment.setArguments(new Bundle().putInt("FragArg"););

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_report,container,false);
        //Button button = (Button)view.findViewById(R.id.button);
//        final EditText e1 = view.findViewById(R.id.name);
//        final EditText e2 = view.findViewById(R.id.phone);
//        final EditText e3 = view.findViewById(R.id.crimtype);
//        final EditText  e4= view.findViewById(R.id.location);
//        final EditText e5 = view.findViewById(R.id.desccrime);
//        final EditText e6 = view.findViewById(R.id.who);
//        final EditText e7 = view.findViewById(R.id.condition);
//
//        Button  b2 = (Button)view.findViewById(R.id.submitcrime);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s1 = e1.getText().toString();
//                String s2 = e2.getText().toString();
//                String s3 = e3.getText().toString();
//                String s4 = e4.getText().toString();
//                String s5 = e5.getText().toString();
//                String s6 = e6.getText().toString();
//                String s7 = e7.getText().toString();
//
//                if (s1.equals(""))
//                {
//                    Toast.makeText(getContext(),"Name field is empty",Toast.LENGTH_SHORT).show();
//                }
//                else if (s2.equals(""))
//                {
//                    Toast.makeText(getContext(),"phone field is empty",Toast.LENGTH_SHORT).show();
//                }
//                else if(s3.equals("")){
//                    Toast.makeText(getContext(),"Crime type can not be  empty",Toast.LENGTH_SHORT).show();
//                }
//                else if(s4.equals(""))
//                {
//                    Toast.makeText(getContext()," Please attach the location",Toast.LENGTH_SHORT).show();
//                }
//                else if (s5.equals(""))
//                {
//                    Toast.makeText(getContext()," Crime Description is empty ",Toast.LENGTH_SHORT).show();
//                }
//                else if (s6.equals(""))
//                {
//                    Toast.makeText(getContext()," please write who were involved ",Toast.LENGTH_SHORT).show();
//                }
//                else if (s7.equals(""))
//                {
//                    Toast.makeText(getContext()," Please give us the condition of th crime ",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        return view;
    }

}
