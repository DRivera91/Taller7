package com.example.daniel.taller7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daniel.taller7.Common.Common;
import com.example.daniel.taller7.Models.Serie;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

public class SerieDetail extends AppCompatActivity {

    KenBurnsView serie_img;
    TextView serie_tl, serie_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_detail);
        serie_img=(KenBurnsView)findViewById(R.id.serie_image);
        serie_tl=(TextView)findViewById(R.id.serie_title);
        serie_gender=(TextView)findViewById(R.id.serie_summary);
        if(getIntent()!= null){
            int serie_index = getIntent().getIntExtra("serie_index",-1);
            if(serie_index!=-1){
                loadSerieDetail(serie_index);
            }
        }
    }

    private void loadSerieDetail(int index) {
        Serie serie = Common.serieList.get(index);
        //se carga la imagen
        Picasso.with(getBaseContext()).load(serie.getImage())
                .into(serie_img);
        serie_tl.setText(serie.getTitle());
        serie_gender.setText(serie.getTags());
    }
}
