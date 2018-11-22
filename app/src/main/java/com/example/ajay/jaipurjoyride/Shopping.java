package com.example.ajay.jaipurjoyride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        }
public void e(View view)
{
    Intent i=new Intent(this,worldtrade.class);
    startActivity(i);



}
}


