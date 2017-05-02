package com.rj_gowda.admin.understanding_the_need_for_newinstance_in_fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment bf=new BlankFragment("This text must disapper upon rotation");

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment,bf)
                .commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
