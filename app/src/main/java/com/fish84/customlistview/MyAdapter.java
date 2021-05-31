package com.fish84.customlistview;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] gameNames;
    private final Integer[] gameImages;

    public MyAdapter(Activity context, String[] gameNames, Integer[] gameImages)
    {
        super(context, R.layout.activity_list_view2, gameNames);
        this.context=context;
        this.gameNames=gameNames;
        this.gameImages=gameImages;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_list_view2, null, true);
        TextView textTitle = (TextView) rowView.findViewById(R.id.textView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        textTitle.setText(gameNames[position]);
        imageView.setImageResource(gameImages[position]);
        return rowView;
    }
}
