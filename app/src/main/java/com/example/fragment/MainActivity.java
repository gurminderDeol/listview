package com.example.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.Fragment;     //if it gives error then use below
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Frag(View view){
        Fragment fragment;

        if(view == findViewById(R.id.btnFragment1))
        {
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_place,fragment);
            ft.commit();     //whenever we begin a transaction we need to commit it

        }
        if(view == findViewById(R.id.btnFragment1))
        {
            fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.Fragment_place,fragment);
            ft.commit();
        }


    }
}
