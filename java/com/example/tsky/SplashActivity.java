package com.example.tsky;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.nan.tsky.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen); // Ganti dengan layout splash Anda

        // Menunggu 2 detik sebelum berpindah ke WelcomeActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent untuk membuka WelcomeActivity setelah splash screen
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup SplashActivity setelah pindah ke WelcomeActivity
            }
        }, 2000); // Menunggu selama 2 detik
    }
}
