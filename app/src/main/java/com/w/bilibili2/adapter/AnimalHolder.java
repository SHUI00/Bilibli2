package com.w.bilibili2.adapter;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.w.bilibili2.R;
import com.w.bilibili2.bean.Animal;

public class AnimalHolder extends ViewHolder {
    private ImageView imageView;
    private TextView textView;
    public AnimalHolder(View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView=itemView.findViewById(R.id.text_view);
    }
    public void bindView(Animal animal){
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getTitle());
    }
}
