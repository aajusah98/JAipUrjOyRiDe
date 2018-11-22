package com.example.ajay.jaipurjoyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
    }
    public void e(View view)
    {

        Intent i=new Intent(this,amer.class);
        startActivity(i);

    }
    public void f(View view)
    {

        Intent i=new Intent(this,nahargarh.class);
        startActivity(i);

    }


}
