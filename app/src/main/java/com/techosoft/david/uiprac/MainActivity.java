package com.techosoft.david.uiprac;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.toolbar);
        View view = getSupportActionBar().getCustomView();

/*        //always cast ur custom toolbar here, and set it as the ActionBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the action bar here to configure the way it behaves
        final android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true); //show or hide the default home button
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowCustomEnabled(true); //enable overrideing the default toolbar layout
        ab.setDisplayShowTitleEnabled(false); //disable the default title element*/



        final Button actionBarTitle = (Button) findViewById(R.id.action_bar_title);
        actionBarTitle.setText("Index(2)");

        final Button actionBarSent = (Button) findViewById(R.id.action_bar_sent);
        actionBarSent.setText("Sent");

        final Button actionBarStaff = (Button) findViewById(R.id.action_bar_staff);
        actionBarStaff.setText("Staff");

        final Button actionBarLocations = (Button) findViewById(R.id.action_bar_locations);
        actionBarLocations.setText("HIPPA Locations");


    }
}
