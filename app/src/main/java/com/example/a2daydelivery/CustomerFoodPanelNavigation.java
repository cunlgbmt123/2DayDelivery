package com.example.a2daydelivery;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.a2daydelivery.cheffoodpanel.ChefHomeFragment;
import com.example.a2daydelivery.cheffoodpanel.ChefOrderFragment;
import com.example.a2daydelivery.cheffoodpanel.ChefPendingOrderFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerCartFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerHomeFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerOrdersFragment;
import com.example.a2daydelivery.customerfoodpanel.CustomerProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerFoodPanelNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_navigation);

        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        String name = getIntent().getStringExtra("PAGE");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(name!=null) {
            if (name.equalsIgnoreCase("Homepage")) {
                loadfragment(new ChefPendingOrderFragment());
            } else if (name.equalsIgnoreCase("Preparipage")) {
                loadfragment(new ChefOrderFragment());
            } else if (name.equalsIgnoreCase("DeliveryOrderpage")) {
                loadfragment(new ChefOrderFragment());
            } else if (name.equalsIgnoreCase("Thankyoupage")) {
                loadfragment(new ChefOrderFragment());
            }
        }else {
            loadfragment(new ChefHomeFragment());
        }
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
                fragment=new CustomerCartFragment();
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
                fragment=new CustomerCartFragment();
                break;
        }
        return loadfragment(fragment);
    }

    private boolean loadfragment(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }

}