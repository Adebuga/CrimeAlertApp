package com.e.crimealertapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CallPolice extends Fragment {
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
        View view = inflater.inflate(R.layout.callpolice_fragment,container,false);
        return view;
    }
}
