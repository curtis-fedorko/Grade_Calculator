package fedorko.curtis.myapplication.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import fedorko.curtis.myapplication.MainActivity;
import fedorko.curtis.myapplication.R;
import fedorko.curtis.myapplication.databinding.ActivityMainBinding;

public class MainView implements IMainView {
    //private GoogleSignInClient mGoogleSignInClient;
    MainActivity activity;
    ActivityMainBinding binding;
    Listener listener;
    public MainView(MainActivity activity) {
        this.activity = activity;
        this.binding = ActivityMainBinding.inflate(activity.getLayoutInflater());
        this.binding.navView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        activity.onHome();
                        return true;
                    case R.id.navigation_dashboard:
                        activity.onProfile();
                        return true;
                    default: return true;
                }}
        });

    }


    public View getRootView() {
        return this.binding.getRoot();
    }


    public void displayFragment(Fragment fragment) {
        this.activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(this.binding.fragmentContainerView.getId(), fragment)
                .commitNow();
    }


    public void displayFragment(Class<? extends Fragment> fragmentClass, Bundle args) {
        this.activity.getSupportFragmentManager().beginTransaction()
                .replace(this.binding.fragmentContainerView.getId(), fragmentClass, args)
                .commitNow();
    }



}

