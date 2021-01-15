package com.example.a2daydelivery.cheffoodpanel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2daydelivery.R;
import com.example.a2daydelivery.UpdateFood;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class ChefHomeAdapter extends RecyclerView.Adapter<ChefHomeAdapter.ViewHolder>{
    private Context mcontext;
    private List<UpdateFood> updateFoodList;
    DatabaseReference databaseReference;
    public ChefHomeAdapter(Context context,List<UpdateFood>updateFoodList){
        this.updateFoodList = updateFoodList;
        this.mcontext = context;
    }
    @NonNull
    @Override
    public ChefHomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.edit_menufood, parent,false);
        return new ChefHomeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChefHomeAdapter.ViewHolder holder, int position) {
        final UpdateFood updateFood = updateFoodList.get(position);
        holder.dishes.setText(updateFood.getDishes());
        updateFood.getRandomUID();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, UpdateDelete_Dish.class);
                intent.putExtra("updatedeletedish",updateFood.getRandomUID());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return updateFoodList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView dishes;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            dishes = itemView.findViewById(R.id.dish_name);

        }
    }
}
