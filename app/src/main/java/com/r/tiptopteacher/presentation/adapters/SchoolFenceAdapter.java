package com.r.tiptopteacher.presentation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * This is the adapter for the list of schools that will
 * be displayed below the map.
 */

public class SchoolFenceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public SchoolFenceAdapter(){}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class SchoolFenceViewHolder{


    }


}
