package com.snabeel.pagination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<FeaturesItem> list;

    public Adapter(ArrayList<FeaturesItem> list){
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        try {
            holder.mag.setText("Magnitude: "+ list.get(position).getProperties().getMag());
            holder.place.setText(list.get(position).getProperties().getPlace());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void updateList(ArrayList<FeaturesItem> list1){
        list.addAll(list1);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView place, mag;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.placeName);
            mag = itemView.findViewById(R.id.magnitude);
        }
    }
}
