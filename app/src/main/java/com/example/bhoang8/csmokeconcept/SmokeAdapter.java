package com.example.bhoang8.csmokeconcept;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SmokeAdapter extends ArrayAdapter<Smoke> {

    //default constructor
    public SmokeAdapter(Activity context, ArrayList<Smoke> smokes){
        super(context, 0, smokes);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.smoke_name_item, parent, false);
        }

        Smoke currentSmoke = getItem(position);
        TextView smoke_name = (TextView) listItemView.findViewById(R.id.smoke_name);
        //ImageView img = (ImageView) listItemView.findViewById(R.id.smoke_gif);
        //TextView smoke_dir = (TextView) listItemView.findViewById(R.id.smoke_directions);

        //img.setImageResource(currentSmoke.get_ImgId());
        //smoke_dir.setText(currentSmoke.get_Smoke_directions());
        smoke_name.setText(currentSmoke.get_smoke_target());

        return listItemView;

    }
}
