package com.example.admin.lovecalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Percent extends AppCompatActivity {
    TextView t;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent);
        t=(TextView)findViewById(R.id.textView);
        i1=(ImageView)findViewById(R.id.imageButton);

        Intent intent=getIntent();
        String percentage=intent.getStringExtra("value");
        int a=Integer.parseInt(percentage);
        if(a>30) {
            i1.setImageResource(R.drawable.congratulations);
        }
        else
        {
            i1.setImageResource(R.drawable.hlo);
        }
            t.setText(percentage + "%");

    }
}
