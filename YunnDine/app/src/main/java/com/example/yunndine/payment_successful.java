package com.example.yunndine;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class payment_successful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_succes);

        Button homePageButton = findViewById(R.id.btnHomePage);

        // Tambahkan logika untuk tombol Home Page
        homePageButton.setOnClickListener(v -> {
            // Pindah ke activity_main
            Intent intent = new Intent(payment_successful.this, activity_main.class);
            startActivity(intent);

            // (Opsional) Tutup aktivitas ini agar pengguna tidak bisa kembali ke halaman ini
            finish();
        });
    }
}
