package com.hfad.translationlab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Button button = view.findViewById(R.id.button);
        Button button2 = view.findViewById(R.id.button2);
        Button button3 = view.findViewById(R.id.button3);

        button.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_englishFragment)
        );
        button2.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_spanishFragment)
        );
        button3.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_frenchFragment)
        );

        return view;

    }
}