package com.fish84.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    Context context;
    ArrayList gameList;

    public static Integer [] gameImages= {
            R.drawable.one, R.drawable.two, R.drawable.three,
            R.drawable.four, R.drawable.five, R.drawable.six,
            R.drawable.seven, R.drawable.eight, R.drawable.nine,
    };
    public static String[] gameNames={
            "Call of the Sea", "DIRT 5", "Forza Horizon 4", "Gears 5", "Halo MCC", "The Medium", "Outriders", "Rocket League", "Zombie Army 4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        MyAdapter adapter =new MyAdapter(this,gameNames, gameImages);

        listView=(ListView) findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this, "You selected " + gameNames[position], Toast.LENGTH_SHORT) .show();
        });

    }
}