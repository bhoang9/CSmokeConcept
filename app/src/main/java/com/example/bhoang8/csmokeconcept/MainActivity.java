package com.example.bhoang8.csmokeconcept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mirage = (TextView) findViewById(R.id.mirage);

        mirage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mirageIntent = new Intent(MainActivity.this, mirageActivity.class);
                startActivity(mirageIntent);
            }
        });
    }
}
