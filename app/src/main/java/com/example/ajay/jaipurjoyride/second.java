package com.example.ajay.jaipurjoyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void a(View view)
    {

        Intent i=new Intent(this,attractions.class);
        startActivity(i);

    }
    public void b(View view)
    {

        Intent i=new Intent(this,Shopping.class);
        startActivity(i);

    }

public  void c(View view)
{
 Intent i=new Intent(this,Cinema.class);
 startActivity(i);
}
    public  void d(View view)
    {
        Intent i=new Intent(this,about.class);
        startActivity(i);
    }
}
