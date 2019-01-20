package com.w.bilibili2.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.w.bilibili2.R;
import com.w.bilibili2.adapter.AnimalAdapter;
import com.w.bilibili2.base.BaseFragment;
import com.w.bilibili2.bean.Animal;

public class DishFragment extends BaseFragment {
   private RecyclerView recyclerView;
   private AnimalAdapter adapter;

    @Override
    public int setIdResource() {
        return R.layout.dishfragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i <10 ; i++) {
            Animal animal=new Animal(R.drawable.ic_cai,"小可爱");
            animals.add(animal);
        }
    }
    public  void initView(){
        recyclerView = getView().findViewById(R.id.dish_recycler_view);
        adapter = new AnimalAdapter(animals,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
