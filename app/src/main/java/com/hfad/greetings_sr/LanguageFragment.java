package com.hfad.greetings_sr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * This fragment displays the desired language chosen from the first fragment
 */
public class LanguageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_language, container, false);

        //retrieve the selected translation
        String language = LanguageFragmentArgs.fromBundle(requireArguments()).getLanguage();

        //Display the correct translation
        TextView tvResponse = view.findViewById(R.id.tv_response);
        tvResponse.setText(language);

        return view;
    }
}