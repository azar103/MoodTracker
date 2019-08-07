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
public class happyFragment extends Fragment {


    public happyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_happy, container, false);
    }

}
