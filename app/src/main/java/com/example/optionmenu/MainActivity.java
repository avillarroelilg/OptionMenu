package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_shop:
                Toast.makeText(this, "presionado shop", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_wallet:
                Toast.makeText(this, "presionado wallet", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_options:
                Toast.makeText(this, "presionado options", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item_acme:
                Toast.makeText(this, "presionado acme", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}