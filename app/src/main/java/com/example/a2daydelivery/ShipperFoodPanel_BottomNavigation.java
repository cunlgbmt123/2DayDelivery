package com.example.a2daydelivery;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.a2daydelivery.shipperfoodpanel.DeliveryOrders;
import com.example.a2daydelivery.shipperfoodpanel.TheOrders;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ShipperFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipper_food_panel__bottom_navigation);

        BottomNavigationView navigationView = findViewById(R.id.shipper_bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        String name = getIntent().getStringExtra("PAGE");
        if (name != null) {
            if (name.equalsIgnoreCase("DeliveryOrderpage")) {
                loadshipperfragment(new TheOrders());
            }
        } else {
            loadshipperfragment(new DeliveryOrders());
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.shiporders:
                fragment = new DeliveryOrders();
                break;
        }
        switch (item.getItemId()){
            case R.id.pendingorders:
            fragment = new TheOrders();
        }
        return loadshipperfragment(fragment);
    }

    private boolean loadshipperfragment(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerbott,fragment).commit();
            return true;
        }
        return false;
    }
}