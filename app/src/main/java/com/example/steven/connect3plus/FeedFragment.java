package com.example.steven.connect3plus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.steven.connect3plus.Interface.ItemClickListener;
import com.example.steven.connect3plus.Model.Feed;
import com.example.steven.connect3plus.ViewHolder.FeedViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


public class FeedFragment extends Fragment {
/*

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_feed, container, false);


        listFeed = (RecyclerView) myFragment.findViewById(R.id.listFeed);
        listFeed.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        listFeed.setLayoutManager(layoutManager);


        loadFeed();
        return myFragment;
    }


    View myFragment;

    RecyclerView listFeed;
    RecyclerView.LayoutManager layoutManager;
    FirebaseRecyclerAdapter<Feed, FeedViewHolder> adapter;

    FirebaseDatabase mDatabase;
    DatabaseReference feed;


    public static FeedFragment newInstance() {
        FeedFragment feedFragment = new FeedFragment();
        return feedFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        feed = FirebaseDatabase.getInstance().getReference();

        mDatabase = FirebaseDatabase.getInstance();
        feed = mDatabase.getInstance("Feed");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_feed, container, false);

        listFeed = (RecyclerView)myFragment.findViewById(R.id.listFeed);
        listFeed.setHasFixedSize();
        layoutManager = new LinearLayoutManager(container.getContext());
        listFeed.setLayoutManager(layoutManager);

        loadFeed();
        return myFragment;
    }

    public void loadFeed(){

        adapter = new FirebaseRecyclerAdapter<Feed, FeedViewHolder>(
                Feed.class,
                R.layout.feed_layout,
                FeedViewHolder.class,
                feed
        ) {
            @Override
            protected void populateViewHolder(FeedViewHolder viewHolder, final Feed model, int position) {
                viewHolder.feed_name.setText(model.getName());
                Picasso.with(getActivity())
                        .load(model.getImage())
                        .into(viewHolder.feed_image);

                viewHolder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {
                        Toast.makeText(getActivity(), String.format("%s|%s", adapter.getRef(position).getKey(), model.getName()), Toast.LENGTH_SHORT).show();
                        //Intent startQuiz = new Intent(getActivity(),StartQuiz.class);
                        com.example.steven.spaghetti.Common.Common.feedId = adapter.getRef(position).getKey();
                        //startActivity(startQuiz);

                    }
                });
            }
        };
        adapter.notifyDataSetChanged();
        listFeed.setAdapter(adapter);

    }*/
}
