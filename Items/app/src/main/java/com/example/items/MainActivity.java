package com.example.items;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Items i1 = new Items("donut", R.drawable.donut, 5.0);
        Items i2 = new Items("tea", R.drawable.tea, 3.0);
        Items i3 = new Items("chocolate",R.drawable.chocolate, 7.0);
        Items i4 = new Items("cheese", R.drawable.cheese, 5.0);
        Items i5 = new Items("honey", R.drawable.honey, 8.0);
        Items i6 = new Items("frise", R.drawable.fries, 4.0);

        products.add(i1);
        products.add(i2);
        products.add(i3);
        products.add(i4);
        products.add(i5);
        products.add(i6);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, 0, products);

        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(itemsAdapter);
    }
}