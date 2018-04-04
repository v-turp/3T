package com.r.tiptopteacher.presentation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.r.tiptopteacher.R;

/**
 * This is the adapter for the list of schools that will
 * be displayed below the map.
 */

public class SchoolFenceAdapter extends RecyclerView.Adapter<SchoolFenceAdapter.SchoolFenceViewHolder> {

    public SchoolFenceAdapter(){}

    @NonNull
    @Override
    public SchoolFenceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolFenceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class SchoolFenceViewHolder extends RecyclerView.ViewHolder{

        public TextView col1;
        public TextView col2;
        public TextView col3;
        public TextView col4;

        public SchoolFenceViewHolder(View itemView) {
            super(itemView);

            col1 = (TextView) itemView.findViewById(R.id.tvSchoolId);
            col2 = (TextView) itemView.findViewById(R.id.tvSchoolName);
            col3 = (TextView) itemView.findViewById(R.id.tvSchoolType);
            col4 = (TextView) itemView.findViewById(R.id.tvSchoolDistrict);
        }
    }


}
