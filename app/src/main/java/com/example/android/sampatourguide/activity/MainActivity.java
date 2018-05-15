package com.example.android.sampatourguide.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.example.android.sampatourguide.R;
import com.example.android.sampatourguide.fragment.AboutFragment;
import com.example.android.sampatourguide.fragment.CultureFragment;
import com.example.android.sampatourguide.fragment.EntertainmentFragment;
import com.example.android.sampatourguide.fragment.GastronomyFragment;
import com.example.android.sampatourguide.fragment.HomeFragment;
import com.example.android.sampatourguide.fragment.ParksFragment;

/**
 * MainActivity
 * Where everything beggins
 */
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    static final int DEFAULT_FRAGMENT_ID = R.id.nav_home;
    static final String CURRENT_FRAGMENT_ID = "currentFragmentId";
    int mCurrentFragmentId = DEFAULT_FRAGMENT_ID;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(CURRENT_FRAGMENT_ID, mCurrentFragmentId);

        Log.v("LJN","onSaveInstanceState(" + mCurrentFragmentId + ")");

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Log.v("LJN","onCreate");
        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of member from saved state
            mCurrentFragmentId = savedInstanceState.getInt(CURRENT_FRAGMENT_ID);
            selectFirstFragment(mCurrentFragmentId);
            navigationView.setCheckedItem(mCurrentFragmentId);
        } else {
            // Set initial fragment.
            selectFirstFragment(DEFAULT_FRAGMENT_ID);
            navigationView.setCheckedItem(DEFAULT_FRAGMENT_ID);
        }

        drawer.closeDrawer(GravityCompat.START);
    }

    private void selectFirstFragment(int id) {
        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (id) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_culture:
                fragment = new CultureFragment();
                break;
            case R.id.nav_parks:
                fragment = new ParksFragment();
                break;
            case R.id.nav_gastronomy:
                fragment = new GastronomyFragment();
                break;
            case R.id.nav_entertainment:
                fragment = new EntertainmentFragment();
                break;
            case R.id.nav_about:
                fragment = new AboutFragment();
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
    }

    /**
     * If Navigation Drawer is displayed, close it instead of leaving application
     */
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * Process the item selected from Navication Drawer
     *
     * @param item
     * @return
     */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // Store current fragment id
        mCurrentFragmentId = id;
        Log.v("LJN","onNavigationItemSelected(" + id + ")");
        //creating fragment object
        Fragment fragment = null;

        //initializing the fragment object which is selected
        switch (id) {
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_culture:
                fragment = new CultureFragment();
                break;
            case R.id.nav_parks:
                fragment = new ParksFragment();
                break;
            case R.id.nav_gastronomy:
                fragment = new GastronomyFragment();
                break;
            case R.id.nav_entertainment:
                fragment = new EntertainmentFragment();
                break;
            case R.id.nav_about:
                fragment = new AboutFragment();
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
