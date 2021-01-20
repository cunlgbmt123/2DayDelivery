package com.example.a2daydelivery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.a2daydelivery.customerfoodpanel.CustomerCartFragmnet;
import com.example.a2daydelivery.customerfoodpanel.CustomerHomeFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerOrdersFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerFoodPanelNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private View viewEndAnimation;
    private ImageView viewAnimation;
    private int mCount;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        viewEndAnimation = findViewById(R.id.endAnimation);
        viewAnimation = findViewById(R.id.viewAnimation);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.cust_Home:
                fragment=new CustomerHomeFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.cart:
                fragment=new CustomerCartFragmnet();
                break;
        }
        switch (item.getItemId()){
            case R.id.cust_profile:
                fragment=new CustomerProfileFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.Cust_order:
                fragment=new CustomerOrdersFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.cart:
                fragment=new CustomerCartFragmnet();
                break;
        }
        return loadcheffragment(fragment);

    }

    private boolean loadcheffragment(Fragment fragment) {

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }

    public View getViewEndAnimation() {
        return viewEndAnimation;
    }


    public ImageView getViewAnimation() {
        return viewAnimation;
    }

}