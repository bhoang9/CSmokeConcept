package com.example.bhoang8.csmokeconcept;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class mirageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirage);

        final ArrayList<Smoke> smokes = new ArrayList<Smoke>();

        smokes.add(new Smoke("CT", "1. \n 2. \n 3.", R.drawable.csgo_img ));

        SmokeAdapter adapter =
                    new SmokeAdapter(this, smokes);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){
                Bundle smoke_data = new Bundle();
                smoke_data.putInt("SMOKE_IMG", smokes.get(i).get_ImgId());
                smoke_data.putString("SMOKE_DIR", smokes.get(i).get_Smoke_directions());

                Intent smokeIntent = new Intent(mirageActivity.this, SmokeActivity.class);
                smokeIntent.putExtras(smoke_data);
                startActivity(smokeIntent);
            }
        });
    }
}
