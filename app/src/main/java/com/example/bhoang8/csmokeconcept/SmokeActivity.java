package com.example.bhoang8.csmokeconcept;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SmokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        Intent intent = getIntent();
        Bundle smoke_data = intent.getExtras();
        String smoke_dir = smoke_data.getString("SMOKE_DIR");
        Integer smoke_img = smoke_data.getInt("SMOKE_IMG");

        ImageView smoke_imgview = (ImageView) findViewById(R.id.smoke_gif);
        TextView smoke_dirview = (TextView) findViewById(R.id.smoke_directions);

        smoke_imgview.setImageResource(smoke_img);
        smoke_dirview.setText(smoke_dir);

    }
}

