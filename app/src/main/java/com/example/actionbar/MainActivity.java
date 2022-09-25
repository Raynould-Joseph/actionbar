package com.example.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lefticon=findViewById(R.id.left_icon);
        ImageView righticon=findViewById(R.id.right_icon);
        TextView text= findViewById(R.id.title);
    }
}