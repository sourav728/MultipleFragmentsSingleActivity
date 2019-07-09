package com.tvd.multiplefragmentssingleactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class TopFragment extends Fragment {

    EditText editText;
    public TopFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_top, container, false);
        editText = view.findViewById(R.id.editText1);
        return view;
    }

    public String getData(){
        return editText.getText().toString();
    }

}
