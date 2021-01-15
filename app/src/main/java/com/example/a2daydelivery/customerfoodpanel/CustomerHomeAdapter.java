package com.example.a2daydelivery.customerfoodpanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a2daydelivery.R;
import com.example.a2daydelivery.UpdateFood;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class CustomerHomeAdapter extends RecyclerView.Adapter<CustomerHomeAdapter.ViewHolder> {
    private Context mcontext;
    private List<UpdateFood> updateFoodList;
    DatabaseReference databaseReference;
    public CustomerHomeAdapter(Context context,List<UpdateFood>updateFoodList){
        this.updateFoodList = updateFoodList;
        this.mcontext = context;
    }
    @NonNull
    @Override
    public CustomerHomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.customer_menufood, parent,false);
        return new CustomerHomeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerHomeAdapter.ViewHolder holder, int position) {
        final UpdateFood updateFood = updateFoodList.get(position);
        Glide.with(mcontext).load(updateFood.getImageURL()).into(holder.imageView);
        holder.foodname.setText(updateFood.getPrice());
        updateFood.getRandomUID();
        updateFood.getChefId();
        holder.price.setText("Price"+updateFood.getPrice()+"VNĐ");
    }

    @Override
    public int getItemCount() {
        return updateFoodList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView foodname,price;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.menu_image);
            foodname = itemView.findViewById(R.id.dishname);
            price = itemView.findViewById(R.id.dishprice);
        }
    }
}
