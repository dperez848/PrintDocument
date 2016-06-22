package com.example.danyp_000.viewtopdf;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {
    ArrayList<String> items;

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.item.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setData(ArrayList<String> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView item;

        PersonViewHolder(View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.textView);
        }
    }

}