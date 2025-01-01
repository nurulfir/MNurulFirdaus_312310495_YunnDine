package com.example.yunndine;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class detail_food extends AppCompatActivity {

    private int quantity = 0;
    private TextView quantityTextView;
    private Button confirmButton;
    private Button backButton; // Tombol Back

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_food);

        quantityTextView = findViewById(R.id.tvQuantity);
        confirmButton = findViewById(R.id.btnConfirm);
        ImageButton backButton = findViewById(R.id.btnBack);
        ImageButton plusButton = findViewById(R.id.btnPlus);
        ImageButton minusButton = findViewById(R.id.btnMinus);

        // Atur tombol "Konfirmasi Pesanan" sebagai non-aktif di awal
        confirmButton.setEnabled(false);
        confirmButton.setTextColor(Color.GRAY);

        // Tombol plus
        plusButton.setOnClickListener(v -> {
            quantity++;
            updateQuantity();
        });

        // Tombol minus
        minusButton.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                updateQuantity();
            }
        });

        // Tombol konfirmasi
        confirmButton.setOnClickListener(v -> {
            if (quantity > 0) {
                // Pindah ke halaman pembayaran
                Intent intent = new Intent(detail_food.this, payment_successful.class);
                intent.putExtra("quantity", quantity);
                startActivity(intent);
            }
        });

        // Tombol back
        backButton.setOnClickListener(v -> {
            // Kembali ke halaman sebelumnya
            finish();
        });
    }

    private void updateQuantity() {
        // Update jumlah pesanan
        quantityTextView.setText(String.valueOf(quantity));

        // Aktifkan atau nonaktifkan tombol "Konfirmasi Pesanan"
        if (quantity > 0) {
            confirmButton.setEnabled(true);
            confirmButton.setTextColor(Color.BLACK);
        } else {
            confirmButton.setEnabled(false);
            confirmButton.setTextColor(Color.GRAY);
        }
    }
}