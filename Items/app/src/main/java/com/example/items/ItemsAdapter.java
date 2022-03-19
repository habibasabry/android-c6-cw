package com.example.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> listItems;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);

        listItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);

        Items currentItem = listItems.get(position);

        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);
        ImageView itemImg = view.findViewById(R.id.itemImage);

        itemName.setText(currentItem.getItemName());
        itemPrice.setText(currentItem.getItemPrice()+"");
        itemImg.setImageResource(currentItem.getItemImage());

        return view;

    }
}
