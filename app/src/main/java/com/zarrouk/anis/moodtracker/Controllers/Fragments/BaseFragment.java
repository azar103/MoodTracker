package com.zarrouk.anis.moodtracker.Controllers.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zarrouk.anis.moodtracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract   class BaseFragment extends Fragment {


    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(this.configureLayoutFragment(), container, false);
        this.configureDesign();
        return  view;
    }

    protected abstract void configureDesign();


    abstract  int configureLayoutFragment();


}
