package com.r.tiptopteacher.presentation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.r.tiptopteacher.R;
import com.r.tiptopteacher.domain.School;

import java.util.List;

/**
 * This is the adapter for the list of schools that will
 * be displayed below the map.
 */

public class SchoolFenceAdapter extends RecyclerView.Adapter<SchoolFenceAdapter.SchoolFenceViewHolder> {

    List<School> schoolList;

    public SchoolFenceAdapter(List<School> schoolList){
        this.schoolList = schoolList;
    }

    @NonNull
    @Override
    public SchoolFenceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // step 1) get a context from the parent
        Context context = parent.getContext();
        // step 2) get a layout inflater from the context
        LayoutInflater inflater = LayoutInflater.from(context);
        // step 3) inflate the layout
        View schoolItemView = inflater.inflate(R.layout.item_school_data_row, parent, false);
        // step 4) create a viewholder instance and pass the item/row layout to the constructor
        SchoolFenceViewHolder schoolFenceViewHolder = new SchoolFenceViewHolder(schoolItemView);

        return schoolFenceViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolFenceViewHolder holder, int position) {
        // stem 1) get the school from the array using the position...the data object/array is the one passed to the constructor
        School school = schoolList.get(position);

        // step 2) use the view holder to create new views...should be the same so we can place the data...hope this is not confusing
        TextView tvSchoolId = holder.tvSchoolId;
        TextView tvSchoolName = holder.tvSchoolName;
        TextView tvSchoolType = holder.tvSchoolType;
        TextView tvSchoolDistrict = holder.tvSchoolDistrict;

        // step 3) add the data the right/respective view
        tvSchoolId.setText(String.valueOf(school.getSchoolID()));
        tvSchoolName.setText(school.getSchoolName());
        tvSchoolType.setText(school.getSchoolType());
        tvSchoolDistrict.setText(school.getDistrictName());
    }

    @Override
    public int getItemCount() {
        return schoolList.size();
    }

    public static class SchoolFenceViewHolder extends RecyclerView.ViewHolder{

        public TextView tvSchoolId;
        public TextView tvSchoolName;
        public TextView tvSchoolType;
        public TextView tvSchoolDistrict;

        //---pass the row item to this constructor from the onCreateViewHolder in the adapter
        public SchoolFenceViewHolder(View itemView) {
            super(itemView);

            tvSchoolId = (TextView) itemView.findViewById(R.id.tvSchoolId);
            tvSchoolName = (TextView) itemView.findViewById(R.id.tvSchoolName);
            tvSchoolType = (TextView) itemView.findViewById(R.id.tvSchoolType);
            tvSchoolDistrict = (TextView) itemView.findViewById(R.id.tvSchoolDistrict);
        }
    }


}
