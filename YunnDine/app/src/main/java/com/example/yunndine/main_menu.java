package com.example.yunndine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        // Inisialisasi tombol back
        ImageButton backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(v -> {
            // Kembali ke halaman sebelumnya
            finish();
        });

        // Inisialisasi gambar besar
        ImageView bigImage = findViewById(R.id.BasoTelur);
        bigImage.setOnClickListener(v -> {
            // Pindah ke halaman berikutnya
            Intent intent = new Intent(main_menu.this, detail_food.class);
            startActivity(intent);
        });

        // Inisialisasi container biru
        LinearLayout blueContainer = findViewById(R.id.BasoContainer);
        blueContainer.setOnClickListener(v -> {
            // Pindah ke halaman berikutnya
            Intent intent = new Intent(main_menu.this, detail_food.class);
            startActivity(intent);
        });
    }
}
