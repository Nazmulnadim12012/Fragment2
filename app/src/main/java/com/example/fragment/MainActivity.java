package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewId);
        String [] name = {"Sachin","Dhoni","Messi","Ronaldo","Lara","Somiaya","Amma","Abba","Monisha"};
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;

        if (position==0){

            fragment = new Sachin();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();

        }
        if (position==1){
            fragment = new Dhoni();

            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();

           /* FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();*/

        }
        if (position==2){
            fragment = new Messi();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position==3){
            fragment = new Ronaldo();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }


    }
}