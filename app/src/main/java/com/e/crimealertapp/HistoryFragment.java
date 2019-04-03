package com.e.crimealertapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HistoryFragment extends Fragment {

    public HistoryFragment(){

    }
    public static HistoryFragment instance(){
        HistoryFragment fragment  = new HistoryFragment();
        //fragment.setArguments(new Bundle().putInt("FragArg"););
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.history_fragment
                ,container,false);
    }
}
