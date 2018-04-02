package com.r.tiptopteacher.presentation.activities;
/**
 *  Note: Because it is hard to anticipate the state of each device,
 *  you must always check for a compatible Google Play services APK
 *  before you access Google Play services features.
 * */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.r.tiptopteacher.R;

public class SchoolRadiusActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSearch;
    private static final String BASE_URL = "https://block.io/api/v2/";
    private static final String KEY = "760c-80bb-6347-b082";
    private static final String API_KEY = "api_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_radius);

        btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


    }

    private void apiTesting(){
//        https://block.io/api/v2/get_current_price/?api_key=760c-80bb-6347-b082


    }
}
