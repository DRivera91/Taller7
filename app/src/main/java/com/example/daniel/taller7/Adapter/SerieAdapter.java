package com.example.daniel.taller7.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.daniel.taller7.Models.Serie;

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
        LayoutInflater inflater= LayoutInflater.from(context);


        return null;
    }
}
