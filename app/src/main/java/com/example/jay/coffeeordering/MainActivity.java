package com.example.jay.coffeeordering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SubmitOrder(View View)
    {
        EditText et=(EditText)findViewById(R.id.edit_text);
        String name=et.getText().toString();
        Intent intent = new Intent(this, Thankyou.class);
        intent.putExtra("arg",name);
        this.startActivity ( intent );

    }

}
