package com.example.ajay.jaipurjoyride;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view)
    {
        Intent i=new Intent(this,second.class);
        startActivity(i);

    }

    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Do you want to exit");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }

        });

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.id1:
                Intent intent= new Intent(this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id2:
                Intent intent1=new Intent(this,MainActivity.class);
                startActivity(intent1);
                Toast.makeText(this, "Tools", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}
