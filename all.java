package com.hassan.temu_clone_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class all extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment's layout
        View view = inflater.inflate(R.layout.fragment_all, container, false);

        GridLayout gridLayout = view.findViewById(R.id.grid);

        // Create a list of items
        List<items> item = new ArrayList<>();
        item.add(new items(R.drawable.img, "Item 1", "$10"));
        item.add(new items(R.drawable.img_1, "Item 2", "$15"));
        item.add(new items(R.drawable.img_2, "Item 3", "$20"));
        item.add(new items(R.drawable.img, "Item 1", "$10"));
        item.add(new items(R.drawable.img_1, "Item 2", "$15"));
        item.add(new items(R.drawable.img_2, "Item 3", "$20"));
        item.add(new items(R.drawable.img, "Item 1", "$10"));
        item.add(new items(R.drawable.img_1, "Item 2", "$15"));
        item.add(new items(R.drawable.img_2, "Item 3", "$20"));
        item.add(new items(R.drawable.img, "Item 1", "$10"));
        item.add(new items(R.drawable.img_1, "Item 2", "$15"));
        item.add(new items(R.drawable.img_2, "Item 3", "$20"));

        // Add cards to the GridLayout
        for (items items : item) {
            CardView cardView = itemscardview.createCardView(getContext(), items);
            gridLayout.addView(cardView);
        }

        return view;
    }
}
