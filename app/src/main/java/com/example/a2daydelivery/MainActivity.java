package com.example.a2daydelivery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a2daydelivery.customerfoodpanel.Cardview;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.a2daydelivery.R.id;
import static com.example.a2daydelivery.R.layout;


public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    FirebaseAuth Fauth;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        imageView = (ImageView)findViewById(id.imageView);
        textView = (TextView)findViewById(id.textView7);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.angiday);
        mp.start();
        imageView.animate().alpha(0f).setDuration(0);
        textView.animate().alpha(0f).setDuration(0);

        imageView.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param animation
             */
            @Override
            public void onAnimationEnd(Animator animation) {
                textView.animate().alpha(1f).setDuration(800);
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Fauth = FirebaseAuth.getInstance();
                if(Fauth.getCurrentUser()!=null){
                    if(Fauth.getCurrentUser().isEmailVerified()){
                        Fauth=FirebaseAuth.getInstance();

                        databaseReference = FirebaseDatabase.getInstance().getReference("User").child(FirebaseAuth.getInstance().getUid()+"/Role");
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                String role = snapshot.getValue(String.class);
                                if(role.equals("Chef")){
                                    startActivity(new Intent(MainActivity.this,ChefFoodPanel_BottomNavigation.class));
                                    finish();

                                }
                                if(role.equals("Customer")){
                                    startActivity(new Intent(MainActivity.this, Cardview.class));
                                    finish();

                                }
                                if(role.equals("Shipper")) {
                                    startActivity(new Intent(MainActivity.this, ShipperFoodPanel_BottomNavigation.class));
                                    finish();
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {
                                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_LONG).show();

                            }
                        });
                    }else{
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Check Whether You Have Verified Your Detail , Otherwise Please Verify");
                        builder.setCancelable(false);
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                Intent intent = new Intent(MainActivity.this,MainMenu.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        Fauth.signOut();
                    }
                }else {

                    Intent intent = new Intent(MainActivity.this, MainMenu.class);
                    startActivity(intent);
                    finish();
                }

            }
        },3000);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}