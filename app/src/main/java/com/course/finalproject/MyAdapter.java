package com.course.finalproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView myPicture;
        TextView myText;

        MyViewHolder(View view) {
            super(view);
            myPicture = view.findViewById(R.id.imageView);
            myText = view.findViewById(R.id.textView);
        }
    }

    private ArrayList<Item> myItemList;

    MyAdapter(ArrayList<Item> item){
        this.myItemList = item;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.myPicture.setImageResource(myItemList.get(position).getItemImageID());
        myViewHolder.myText.setText(myItemList.get(position).getItemName());

        myViewHolder.myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailItemActivity.class);

                int testPrice = myItemList.get(position).getItemPrice();

                intent.putExtra("name", myItemList.get(position).getItemName());
                intent.putExtra("imageID", myItemList.get(position).getItemImageID());
                intent.putExtra("imageID2", myItemList.get(position).getItemImageID2());
                intent.putExtra("price", myItemList.get(position).getItemPrice());
                intent.putExtra("desc", myItemList.get(position).getItemDesc());
                intent.putExtra("url", myItemList.get(position).getItemUrl());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }
}
