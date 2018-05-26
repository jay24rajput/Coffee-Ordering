package com.example.jay.coffeeordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Thankyou extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        String name = getIntent().getExtras().getString("arg");
        display("Congrats!"+"Mr "+name+" Your Order is placed\n");
    }

    public void display(String text)
    {
        TextView textView=(TextView)findViewById(R.id.summary_view);
        textView.setText(text);
    }


}
