package com.example.akscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //set the variables
    EditText ed_one, ed_two;
    TextView textView;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//initialization korte hobe
        ed_one = findViewById(R.id.ed_one);
        ed_two = findViewById(R.id.ed_two);

        textView = findViewById(R.id.textView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

     //onclick listnes setting
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
           int val1,val2,ans;       //variables

             val1=Integer.parseInt(ed_one.getText().toString());
             val2=Integer.parseInt(ed_two.getText().toString());

             ans= val1+val2;

             textView.setText("Ans is: "+ ans);

         }
     });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed_one.getText().toString());
                val2=Integer.parseInt(ed_two.getText().toString());

                ans= val1-val2;

                textView.setText("Ans is: "+ ans);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed_one.getText().toString());
                val2=Integer.parseInt(ed_two.getText().toString());

                ans= val1*val2;

                textView.setText("Ans is: "+ ans);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed_one.getText().toString());
                val2=Integer.parseInt(ed_two.getText().toString());

                ans= val1/val2;

                textView.setText("Ans is: "+ ans);

            }
        });


    }
}