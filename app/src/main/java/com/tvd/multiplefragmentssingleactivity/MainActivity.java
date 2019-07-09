package com.tvd.multiplefragmentssingleactivity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicate{

    TopFragment frg;
    MiddleFragment frg1;
    BottomFragment frg2;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frg = new TopFragment();
        frg1 = new MiddleFragment();
        frg2 = new BottomFragment();

        FragmentManager manager= getSupportFragmentManager();
        transaction =manager.beginTransaction();
        transaction.add(R.id.My_Container_1_ID, frg);
        transaction.add(R.id.My_Container_2_ID, frg1);
        transaction.add(R.id.My_Container_3_ID, frg2);
        transaction.commit();
    }


    @Override
    public void sendData() {
        String temp = frg.getData();
        frg2.incrementData(temp);
    }
}
