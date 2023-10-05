package com.abdullah.course_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class exploreFragment2 extends Fragment {

    RecyclerView rec;
    ArrayList<courseDomain> arr = new ArrayList<>();
    course_adapter my_adapter;
    public int[] pic ={R.drawable.pic1,R.drawable.pic2,R.drawable.pic1};
    public String[] title={"Quick Learn C# Language","Full Course Android Kotlin","Quick Learn Java language"};
    public String[]owner={"Jammie Young","Alex Alba","Sara Anderson"};
    public double[]price={128,560,1000};
    public double[]star={4.6,4.0,4.7};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_explore2, container, false);
         rec = v.findViewById(R.id.view);
         my_adapter=new course_adapter(arr,getContext());
         fillArray();
         rec.setAdapter(my_adapter);
         rec.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
         return v;
    }

    private void fillArray() {
        for(int i=0 ; i<pic.length ; i++){
            arr.add(new courseDomain(title[i],owner[i],price[i],star[i],pic[i]));
        }
    }
}