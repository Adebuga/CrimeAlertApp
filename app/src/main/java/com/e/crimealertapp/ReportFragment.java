package com.e.crimealertapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportFragment extends Fragment {

    public ReportFragment(){


    }
    public static ReportFragment instance(){
        ReportFragment fragment  = new ReportFragment();
        //fragment.setArguments(new Bundle().putInt("FragArg"););

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_report,container,false);
        //Button button = (Button)view.findViewById(R.id.button);

        return view;
    }
}
