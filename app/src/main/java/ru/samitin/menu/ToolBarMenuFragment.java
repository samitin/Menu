package ru.samitin.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class ToolBarMenuFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_toolbar_menu, container, false);
        setHasOptionsMenu(true);
        setActionBar();
        return v;
    }
    private void setActionBar() {
        setHasOptionsMenu(true);
        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setSubtitle("Coat of arms");
        }
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu,menu);

        //Спрятать пункт меню:
        MenuItem item=menu.findItem(R.id.action_hide);
        if (item!=null)
            item.setVisible(false);

        //Добавить пункт меню:
        menu.add(Menu.NONE, 10, Menu.NONE, "Item name");

        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_about:
                Toast.makeText(getContext(), "Нажата кнопка about", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_exit:
                Toast.makeText(getContext(), "Нажата кнопка exit", Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().popBackStack();
        }


        return super.onOptionsItemSelected(item);
    }

}
