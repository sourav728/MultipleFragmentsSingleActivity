package com.tvd.multiplefragmentssingleactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {
    TextView display_text;
    public BottomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_bottom, container, false);
        display_text = view.findViewById(R.id.textView1);
        return view;
    }

    public void incrementData(String displayText){
        display_text.setText(displayText);
    }

}
