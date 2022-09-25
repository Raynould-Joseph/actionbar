package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lefticon = findViewById(R.id.left_icon);
        ImageView righticon = findViewById(R.id.right_icon);
        TextView text = findViewById(R.id.title);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.add:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                break;
            case R.id.exit:
                finish();
                break;
            case R.id.share:
                startActivity(new Intent(MainActivity.this, share_activity.class));
                break;


            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}