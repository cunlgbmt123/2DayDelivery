package com.example.a2daydelivery.customerfoodpanel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a2daydelivery.MainMenu;
import com.example.a2daydelivery.R;
import com.google.firebase.auth.FirebaseAuth;

public class CustomerHomeFragment extends Fragment {
//    private CustomerFoodPanelNavigation customerFoodPanelNavigation;
//    private RecyclerView rcvItem;
//    private View mview;
//    private Adapter adapter;
//    public CustomerHomeFragment() {
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        mview = inflater.inflate(R.layout.fragment_customerhome, container, false);
//        this.getActivity().setTitle("Home");
//        customerFoodPanelNavigation = (CustomerFoodPanelNavigation) getActivity();
//        rcvItem = mview.findViewById(R.id.recycle_menu);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(customerFoodPanelNavigation);
//
//        rcvItem.setLayoutManager(linearLayoutManager);
//
//        adapter = new Adapter();
//        adapter.setData(getListItem(), new Adapter.Clickaddtocard() {
//            @Override
//            public void onClickaddtocard(ImageView imgaddtocard, Item item) {
//                Animation.translateAnimation(customerFoodPanelNavigation.getViewAnimation(), imgaddtocard, customerFoodPanelNavigation.getViewEndAnimation(), new android.view.animation.Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(android.view.animation.Animation animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(android.view.animation.Animation animation) {
//                        item.setAddtocard(true);
//                        imgaddtocard.setBackgroundResource(R.color.gray);
//
//                        adapter.notifyDataSetChanged();
//
//
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(android.view.animation.Animation animation) {
//
//                    }
//                });
//            }
//        });
//        rcvItem.setAdapter(adapter);
//
//        return mview;
//    }
//
//    private List<Item> getListItem(){
//        List<Item> list = new ArrayList<>();
//        list.add(new Item(R.drawable.pancako, "Pancako", "6000vnd/one"));
//        list.add(new Item(R.drawable.bunbo, "Nudle Beef", "60000vnd/one"));
//        list.add(new Item(R.drawable.banhday, "RiceTic", "16000vnd/one"));
//        list.add(new Item(R.drawable.chagio, "Roll", "6000vnd/one"));
//        list.add(new Item(R.drawable.haisan, "Sea Food", "80000vnd/one"));
//        list.add(new Item(R.drawable.phobo, "Pho", "60000vnd/one"));
//        list.add(new Item(R.drawable.chagio, "Ptoto", "6000vnd/one"));
//        list.add(new Item(R.drawable.pancako, "Piza", "6000vnd/one"));
//
//        return list;//  }


    @Nullable
@Override
public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    View v = inflater.inflate(R.layout.fragment_thaythe,null);
    getActivity().setTitle("Home");
    setHasOptionsMenu(true);
    return v;

}

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.logout,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int idd = item.getItemId();
        if(idd == R.id.LOGOUT){
            Logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void Logout() {

        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(getActivity(), MainMenu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

}
