package com.tvd.multiplefragmentssingleactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MiddleFragment extends Fragment implements View.OnClickListener {
    Button btn;
    Communicate cm;

    public MiddleFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_middle, container, false);
        cm = (Communicate) getActivity();
        btn = view.findViewById(R.id.button1);
        btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View arg0) {
        cm.sendData();
    }
}
