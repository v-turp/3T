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
import com.r.tiptopteacher.domain.DaggerDetention;
import com.r.tiptopteacher.domain.Detention;
import com.r.tiptopteacher.presentation.adapters.SchoolFenceAdapter;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SchoolFenceActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private RecyclerView rv;
    private Button btnSchoolSearch;

    @Inject
    SchoolMockDataFactory schoolMockDataFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_fence);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // ioc
        Detention detention = DaggerDetention.builder().build();
        schoolMockDataFactory = detention.getSchoolMockDataFactory();

        rv =  findViewById(R.id.rvSchools);
        SchoolFenceAdapter schoolFenceAdapter = new SchoolFenceAdapter(schoolMockDataFactory.getAListOfSchools());
        rv.setAdapter(schoolFenceAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        // page view setup
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
        LatLng losAngeles = new LatLng(34.052235, -118.2437);
        mMap.addMarker(new MarkerOptions().position(losAngeles).title("Marker in Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(losAngeles));
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

    private void searchTeachers(){  // TODO NOTE: this is calling the block.io transactions for testing. should convert to teacher search call when mike is ready
        /*https://www.google.com/maps/embed/v1/MODE?key=<>&parameters*/
        final String gmak = "AIzaSyAi-n_zreP3-V71dNPl1QEOjMqOeMe1ZBE";
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl(gmak)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();


    }
}
