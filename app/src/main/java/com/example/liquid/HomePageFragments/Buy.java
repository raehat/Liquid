package com.example.liquid.HomePageFragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.liquid.Adapters.BuyShareAdapter;
import com.example.liquid.Models.BuyShareModel;
import com.example.liquid.R;

import java.util.ArrayList;

public class Buy extends Fragment {

    RecyclerView recyclerView;
    ArrayList<BuyShareModel> list;

    @Nullable
    @Override

    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_buy, container, false);

        Toast.makeText(getContext(), "" + "L", Toast.LENGTH_SHORT).show();

        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();

        try {
            list.add(new BuyShareModel("TATA","Tata Steel Corp.",25,3));
        } catch (Exception e) {
            Toast.makeText(getContext(), "" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        recyclerView.setAdapter(new BuyShareAdapter(list, getContext()));

        return view;
    }
}