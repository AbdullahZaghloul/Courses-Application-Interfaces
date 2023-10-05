package com.abdullah.course_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {

    BottomNavigationView b;
    exploreFragment2 exploreFragment2 = new exploreFragment2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b=findViewById(R.id.nav_bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,exploreFragment2).commit();
    }
}