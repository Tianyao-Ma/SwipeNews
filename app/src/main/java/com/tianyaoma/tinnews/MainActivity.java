package com.tianyaoma.tinnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tianyaoma.tinnews.model.NewsResponse;
import com.tianyaoma.tinnews.network.NewsApi;
import com.tianyaoma.tinnews.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //In Android R is an Java-class that is auto-generated from your resources by the build process.
        // The R. layout member is a auto-generated class that contains all IDs for layouts.
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(navView, navController);
        NavigationUI.setupActionBarWithNavController(this, navController);
    }

    //Overriding onSupportNavigateUp is for handling the top left back button.
// Notice the title bar also changes with bottom navigation.
    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }

}