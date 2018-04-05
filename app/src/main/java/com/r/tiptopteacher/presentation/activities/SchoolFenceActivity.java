package com.r.tiptopteacher.presentation.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.r.tiptopteacher.R;
import com.r.tiptopteacher.data.SchoolMockDataFactory;
import com.r.tiptopteacher.presentation.adapters.SchoolFenceAdapter;

public class SchoolFenceActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private RecyclerView rv;
    private Button btnSchoolSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_fence);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // step 1) ---setup the recyclyerview
        rv =  findViewById(R.id.rvSchools);
        // step 2) setup the adapter
        SchoolFenceAdapter schoolFenceAdapter = new SchoolFenceAdapter(SchoolMockDataFactory.getAListOfSchools());
        // step 3) add the adapter to the recycler view
        rv.setAdapter(schoolFenceAdapter);
        // step 4) add the layout manager
        rv.setLayoutManager(new LinearLayoutManager(this));

        // initialize and add listeners
        btnSchoolSearch = (Button) findViewById(R.id.btnSearch);
        btnSchoolSearch.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        btnSchoolSearch.setOnClickListener(null);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.btnSearch:
                Toast.makeText(this, "Testing Espresso Button Click", Toast.LENGTH_LONG).show();
                break;

            default:
               break;
        }
    }
}
