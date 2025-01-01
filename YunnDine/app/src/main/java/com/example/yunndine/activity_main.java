package com.example.yunndine;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menambahkan event klik pada Menu Utama
        findViewById(R.id.menuutama).setOnClickListener(v -> {
            // Berpindah ke MainMenuActivity
            Intent intent = new Intent(activity_main.this, main_menu.class);
            startActivity(intent);
        });
    }
}
