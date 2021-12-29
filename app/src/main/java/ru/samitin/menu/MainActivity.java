package ru.samitin.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_toolbar_menu).setOnClickListener(V -> showFragment(new ToolBarMenuFragment()));
    }

    private void showFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.container,fragment)
                .commit();
    }
}