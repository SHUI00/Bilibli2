package com.w.bilibili2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.w.bilibili2.R;
import com.w.bilibili2.bean.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
private List<Animal> animals;
private Context context;
    public AnimalAdapter(List<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return new AnimalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
           animalHolder.bindView(animals.get(i));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
