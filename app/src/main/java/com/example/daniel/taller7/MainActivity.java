package com.example.daniel.taller7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.daniel.taller7.Adapter.SerieAdapter;
import com.example.daniel.taller7.Common.Common;
import com.example.daniel.taller7.Models.Serie;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class MainActivity extends AppCompatActivity {

    FeatureCoverFlow coverFlow;
    SerieAdapter adapter;
    TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        adapter = new SerieAdapter(Common.serieList,this);
        coverFlow= (FeatureCoverFlow)findViewById(R.id.coverFlow);
        mTitle=(TextSwitcher)findViewById(R.id.stitle);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater= LayoutInflater.from(MainActivity.this);
                TextView text = (TextView) inflater.inflate(R.layout.layout_title,null);
                return text;
            }
        });
        coverFlow.setAdapter(adapter);
        coverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(Common.serieList.get(position).getTitle());
            }

            @Override
            public void onScrolling() {

            }
        });
        coverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SerieDetail.class);
                intent.putExtra("serie_index", position);
                startActivity(intent);
            }
        });

    }

    private void initData() {
        Serie series = new Serie(getString(R.string.Academia),"https://firebasestorage.googleapis.com/v0/b/todo-series.appspot.com/o/boku0.png?alt=media&token=ed92b6ae-d9b6-4733-836d-f8a6b9389cdd",getString(R.string.cuantity_seasons_3),getString(R.string.gender_academia));
        Common.serieList.add(series);


    }
}
