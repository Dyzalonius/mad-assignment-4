package com.example.bucketlist;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListItemAdapter extends RecyclerView.Adapter<BucketListItemViewHolder> {

    private Context context;
    public List<BucketListItem> items;

    public BucketListItemAdapter(Context context, List<BucketListItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BucketListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell, parent, false);
        return new BucketListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListItemViewHolder holder, int position) {
        final BucketListItem item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());

        if (item.getDone()) {
            System.out.println("strike through");
            holder.title.setPaintFlags(holder.title.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            holder.description.setPaintFlags(holder.description.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            holder.checkBox.setChecked(true);
        } else {
            holder.title.setPaintFlags(holder.title.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG);
            holder.description.setPaintFlags(holder.description.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG);
            holder.checkBox.setChecked(false);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
