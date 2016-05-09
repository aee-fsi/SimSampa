package com.hfad.simsampa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alexandre on 07/05/2016.
 */
public class AdaptadorCustom extends ArrayAdapter{
    public AdaptadorCustom(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;

        DataHandler handler;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.minha_celula,parent, false);
            handler = new DataHandler();
            handler.imageView4 = (ImageView)row.findViewById(R.id.imageView4);
            handler.nomeSub = (TextView)row.findViewById(R.id.nomeSub);
            handler.popSub = (TextView)row.findViewById(R.id.popSub);
            handler.areaSub = (TextView)row.findViewById(R.id.areaSub);
            row.setTag(handler);
        }else {
            handler = (DataHandler)row.getTag();
        }

        MeuDataProvider dataProvider;
        dataProvider = (MeuDataProvider) this.getItem(position);
        handler.imageView4.setImageResource(dataProvider.getIcone());
        handler.nomeSub.setText(dataProvider.getNome());
        handler.popSub.setText(dataProvider.getPopulacao());
        handler.areaSub.setText(dataProvider.getArea());

    return row;
    }




    private class DataHandler {

        ImageView imageView4;
        TextView nomeSub;
        TextView popSub;
        TextView areaSub;
    }
}
