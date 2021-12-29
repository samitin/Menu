package ru.samitin.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_toolbar_menu).setOnClickListener(V -> showFragment(new ToolBarMenuFragment()));
        initToolbar();
    }

    private void showFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.container,fragment)
                .commit();
    }
    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}