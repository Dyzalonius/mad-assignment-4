package com.example.bucketlist;

import android.graphics.Paint;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListItemViewHolder extends RecyclerView.ViewHolder {

    TextView title, description;
    CheckBox checkBox;
    View view;

    public BucketListItemViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.textViewTitle);
        description = itemView.findViewById(R.id.textViewDescription);
        checkBox = itemView.findViewById(R.id.checkBox);

        view = itemView;
    }
}
