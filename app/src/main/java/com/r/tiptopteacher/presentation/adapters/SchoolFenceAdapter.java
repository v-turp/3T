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

        public TextView tvSchoolId;
        public TextView tvSchoolName;
        public TextView tvSchoolTypecol3;
        public TextView tvSchoolDistrict;

        public SchoolFenceViewHolder(View itemView) {
            super(itemView);

            tvSchoolId = (TextView) itemView.findViewById(R.id.tvSchoolId);
            tvSchoolName = (TextView) itemView.findViewById(R.id.tvSchoolName);
            tvSchoolTypecol3 = (TextView) itemView.findViewById(R.id.tvSchoolType);
            tvSchoolDistrict = (TextView) itemView.findViewById(R.id.tvSchoolDistrict);
        }
    }


}
