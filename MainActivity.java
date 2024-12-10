package com.hassan.temu_clone_2;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, new home())  // Load the Home fragment
                .commit();


        nav_bottom=findViewById(R.id.bottom_nav);

        nav_bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id==R.id.home){
                    FragmentManager fm=getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.frame,new home()).commit();

                } else if (id==R.id.search) {
                    FragmentManager fm=getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.frame,new search()).commit();

                } else if (id==R.id.you) {
                    FragmentManager fm=getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.frame,new You()).commit();

                }else {
                    FragmentManager fm=getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.frame,new cart()).commit();

                }


                return true;
            }
        });


    }

}