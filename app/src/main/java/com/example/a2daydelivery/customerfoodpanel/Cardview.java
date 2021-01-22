package com.example.a2daydelivery.customerfoodpanel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2daydelivery.R;
import com.google.android.material.textfield.TextInputLayout;

import java.text.DecimalFormat;

public class Cardview extends AppCompatActivity {
    private TextView a,b,c,d,i, k,l,m,tenmon,giamon;
    TextInputLayout diachi;
    private CheckBox e, f,g,h;
    private Button cart,Order;
    String  mon,gia;
    String food,price;
    private Card cardd;
    String contact,pricee,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        addListenerOnButtonClick();

    }
        public void addListenerOnButtonClick(){
            a = findViewById(R.id.mon1);
            b = findViewById(R.id.mon2);
            c = findViewById(R.id.mon3);
            d = findViewById(R.id.mon4);
            i = findViewById(R.id.gia1);
            k = findViewById(R.id.gia2);
            l = findViewById(R.id.gia3);
            m = findViewById(R.id.gia4);
            e = findViewById(R.id.checkbox1);
            f = findViewById(R.id.checkbox2);
            g = findViewById(R.id.checkbox3);
            h = findViewById(R.id.checkbox4);
            diachi = (TextInputLayout)findViewById(R.id.add);
            tenmon = findViewById(R.id.tenmon);
            giamon = findViewById(R.id.gia);
            Order = findViewById(R.id.Order);
            cart = findViewById(R.id.Cart);


            cart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double total = 0;
                    StringBuilder kq=new StringBuilder();
                    kq.append("Food orders is: ");
                    if(e.isChecked()){
                        kq.append("\n\t - Pancako: 6000vnd/one");
                        total += 6000;
                    }
                    if(f.isChecked()){
                        kq.append("\n\t - Nudle Beef: 60000vnd/one");
                        total += 60000;
                    }
                    if(g.isChecked()){
                        kq.append("\n\t - Ricetick: 16000vnd/one");
                        total += 16000;
                    }
                    if(h.isChecked()){
                        kq.append("\n\t - Roll: 26000vnd/one");
                        total += 60000;
                    }


                    DecimalFormat tien = new DecimalFormat("#,##0.00");
                    String Tong = tien.format(total);


                    kq.append("\n\t ==> Total: "+Tong+"vnd").toString();
                    Toast.makeText(getApplicationContext(),kq.toString(), Toast.LENGTH_SHORT).show();
                    gia = Tong.toString();
                    mon = kq.append("\n\t ==> Total: "+Tong+"vnd").toString();
                    Order.setVisibility(View.VISIBLE);
                    diachi.setVisibility(View.VISIBLE);
                    contact = diachi.getEditText().getText().toString();
                    tenmon.setVisibility(View.VISIBLE);
                    name = mon.toString();
                    giamon.setVisibility(View.VISIBLE);
                    pricee = gia.toString();


                }
            });

        }


    }