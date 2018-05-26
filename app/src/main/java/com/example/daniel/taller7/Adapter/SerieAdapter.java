package com.example.daniel.taller7.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.taller7.Models.Serie;
import com.example.daniel.taller7.R;
import com.squareup.picasso.Picasso;

import java.util.ConcurrentModificationException;
import java.util.List;

public class SerieAdapter extends BaseAdapter {

    List<Serie> serieList;
    Context context;

    public SerieAdapter(List<Serie>serieList, Context context){
        this.serieList=serieList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return serieList.size();
    }

    @Override
    public Object getItem(int position) {
        return serieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        if (rootView==null){
            LayoutInflater inflater= LayoutInflater.from(context);
            View itemView = inflater.inflate(R.layout.layout_item,null);
            TextView name = (TextView)itemView.findViewById(R.id.label);
            ImageView imageView = (ImageView)itemView.findViewById(R.id.image);
            Picasso.with(context).load(serieList.get(position).getImage()).into(imageView);
            name.setText(serieList.get(position).getTitle());
            return imageView;
        }


        return rootView;
    }
}
