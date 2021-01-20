package com.example.a2daydelivery.customerfoodpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2daydelivery.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.dishView>{
private List<Item>listitems;
private Clickaddtocard clickaddtocard;

public interface Clickaddtocard{
    void onClickaddtocard(ImageView imgaddtocard, Item item);
}
public void setData(List<Item> List,Clickaddtocard listener){
    this.listitems = List;
    this.clickaddtocard = listener;
    notifyDataSetChanged();

}
    @NonNull
    @Override
    public dishView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_menudish, parent,false);
        return new dishView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dishView holder, int position) {
        final Item item = listitems.get(position);
        if(item == null){
            return;
        }
        holder.imageView.setImageResource(item.getId());
        holder.name.setText(item.getName());
        holder.price.setText(item.getPrice());
        if(item.isAddtocard()) {
            holder.card.setBackgroundResource(R.color.gray);
        }else{
            holder.card.setBackgroundResource(R.color.Red);
        }
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!item.isAddtocard()){
                clickaddtocard.onClickaddtocard(holder.card, item);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (listitems!=null){
            return listitems.size();
        }
        return 0;
    }

    public class dishView extends RecyclerView.ViewHolder{
        private TextView name, price;
        ImageView imageView,card;
        public dishView(@NonNull View itemView) {
            super(itemView);
                imageView = itemView.findViewById(R.id.menu_image);
                card = itemView.findViewById(R.id.addtocard);
                name = itemView.findViewById(R.id.dishname);
                price = itemView.findViewById(R.id.dishprice);
        }
    }
}
