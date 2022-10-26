package com.hfad.greetings_sr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * This fragment serves as a beginning fragment for an app
 */
public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Button btn = view.findViewById(R.id.btn_translate);
        Spinner spinnerLanguage = view.findViewById(R.id.lang_spinner);

        //Set the on click for the translate button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                String msg = spinnerLanguage.getSelectedItem().toString();
                String response = getLanguage(msg);

                FirstFragmentDirections.ActionFirstFragmentToLanguageFragment action =
                        FirstFragmentDirections.actionFirstFragmentToLanguageFragment(response);

                Navigation.findNavController(view).navigate(action);
            }
        });
        return view;

    }

    /**
     * Gets the translation for the specific language
     * @param language
     * @return the translated text
     */
    public String getLanguage(String language) {
        if (language.equals("English"))
            return "Hello!";
        else if (language.equals("Spanish"))
            return "Hola!";
        else if (language.equals("French"))
            return "Bonjour!";
        else
            return "";
    }

}