package com.example.fol;

import static com.example.fol.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MenuFragment extends Fragment {

    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int novoItem = item.getItemId();
        if (novoItem == R.id.menu_principal) {
            Toast.makeText(getActivity(), "Menuzzito", Toast.LENGTH_LONG).show();
        }
        if (novoItem == R.id.outra_opcao) {
            Toast.makeText(getActivity(), "Tempituzzi", Toast.LENGTH_LONG).show();
        }
        if (novoItem == R.id.ultima_opcao) {
            Toast.makeText(getActivity(), "Equipamentizzi", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(layout.fragment_menu, container, false);
    }
}