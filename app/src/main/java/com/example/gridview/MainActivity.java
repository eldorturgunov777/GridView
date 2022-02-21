package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] name = {"Java","Kotlin","C++","Java Script","PHP", "Java", "Kotlin", "C++", "Java Script", "PHP"};

        int[] image = {
                R.drawable.java,
                R.drawable.kotlin,
                R.drawable.cplusplus,
                R.drawable.js,
                R.drawable.php,
                R.drawable.java,
                R.drawable.kotlin,
                R.drawable.cplusplus,
                R.drawable.js,
                R.drawable.php,

        };

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this, name, image);
        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You click " + name[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}