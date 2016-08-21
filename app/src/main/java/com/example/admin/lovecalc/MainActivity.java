package com.example.admin.lovecalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button calc;
    EditText e1;
    EditText e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc=(Button)findViewById(R.id.button);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=(EditText)findViewById(R.id.editText);
                e2=(EditText)findViewById(R.id.editText2);

                String s=e1.getText().toString();
                String s1=e2.getText().toString();
                    int sum=0;
                    int sum1=0;
                    for(int i=0;i<s.length();i++)
                    {
                        char ch=s.charAt(i);
                        int ascii=ch;
                        sum=sum+ascii;
                    }
                    for(int i=0;i<s1.length();i++)
                    {
                        char ch=s1.charAt(i);
                        int ascii=ch;
                        sum1=sum1+ascii;
                    }
                    int total=sum+sum1;
                    int lovepercentage=total%100;
                Intent i=new Intent("com.example.admin.lovecalc.Percent");
                i.putExtra("value",String.valueOf(lovepercentage));
                startActivity(i);


            }
        });
    }
}
