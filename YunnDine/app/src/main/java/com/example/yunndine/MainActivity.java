package com.example.yunndine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton profileIcon = findViewById(R.id.profile_icon);
        ImageButton notificationIcon = findViewById(R.id.notification_icon);
        ImageButton settingsIcon = findViewById(R.id.settings_icon);
        Button openButton = findViewById(R.id.open_button);
        Button mainMenuButton = findViewById(R.id.main_menu_button);
        Button dessertButton = findViewById(R.id.dessert_button);

        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk profile icon
            }
        });

        notificationIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk icon notifikasi
            }
        });

        settingsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk icon pengaturan
            }
        });

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk tombol "Pembuka"
            }
        });

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk tombol "Menu Utama"
            }
        });

        dessertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk tombol "Penutup"
            }
        });
    }
}
