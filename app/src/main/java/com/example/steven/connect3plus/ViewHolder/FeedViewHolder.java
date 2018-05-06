package com.example.steven.connect3plus.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.steven.connect3plus.Interface.ItemClickListener;
import com.example.steven.connect3plus.R;

public class FeedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView feed_name;
    public ImageView feed_image;

    private ItemClickListener itemClickListener;

    public FeedViewHolder(View itemView) {
        super(itemView);
        feed_image = (ImageView)itemView.findViewById(R.id.feed_image);
        feed_name = (TextView)itemView.findViewById(R.id.feed_name);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }
}
