package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button defult,custom,simple;
    AlertDialog.Builder builder;
    AlertDialog simplee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defult = findViewById(R.id.defult);
        simple = findViewById(R.id.simple);
        custom = findViewById(R.id.custom);
        builder = new AlertDialog.Builder(this);

        builder.setTitle("message");
        simplee = builder.create();
    }

    public void defult(View view) {

        builder.setMessage("text");
        builder.setPositiveButton("Yes",(dialogInterface, i) -> {

        });
        builder.setNegativeButton("No",(dialogInterface, i) -> {

        });
        builder.setNeutralButton("Cancel",(dialogInterface, i) -> {

        }) ;
        builder.show();

    }

    public void simple(View view) {

        simplee.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        view = LayoutInflater.from(this).inflate(R.layout.simple_dailog_box,null);

        simplee.setView(view);
        simplee.show();

    }
}