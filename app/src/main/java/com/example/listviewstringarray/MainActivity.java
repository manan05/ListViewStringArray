package com.example.listviewstringarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names  = new String[]{
            "Tachanka",
            "Jager",
            "Rook",
            "Thermite",
            "Jackal",
            "Kapkan",
            "Sledge",
            "IQ",
            "Ash",
            "Zofia",
            "Ela",
            "Twitch",
            "Doc",
            "Montagne",
            "Blitz",
            "Fuze"

    };
    ListView lvNames;
    // The mechanism of Showing data from data to view is adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNames = findViewById(R.id.lvNames);
        ArrayAdapter<String> namesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                names

        );

        lvNames.setAdapter(namesAdapter);

    }
}
