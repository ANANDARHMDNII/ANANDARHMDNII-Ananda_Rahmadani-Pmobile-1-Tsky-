package com.example.tsky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nan.tsky.R;

public class HalamanToDoListActivity2 extends AppCompatActivity {

    private ImageView backIos, profileImage, clockImage;
    private TextView congratsText;
    private CheckBox checkboxWakeUp, checkboxBreakfast, checkboxClass, checkboxLunch, checkboxHomework;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_to_do_list_2activity); // Ganti dengan layout Anda

        // Initialize views
        backIos = findViewById(R.id.back_ios);
        profileImage = findViewById(R.id.profile_image);
        clockImage = findViewById(R.id.clock_image);
        congratsText = findViewById(R.id.congrats_text);
        checkboxWakeUp = findViewById(R.id.checkbox_wake_up);
        checkboxBreakfast = findViewById(R.id.checkbox_breakfast);
        checkboxClass = findViewById(R.id.checkbox_class);
        checkboxLunch = findViewById(R.id.checkbox_lunch);
        checkboxHomework = findViewById(R.id.checkbox_homework);
        cardView = findViewById(R.id.card_view);

        // Set event listeners
        backIos.setOnClickListener(v -> {
            // Navigate back to MainActivity
            Intent intent = new Intent(HalamanToDoListActivity2.this, MainActivity.class);
            startActivity(intent);
            finish(); // Close the current activity
        });

        checkboxWakeUp.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Wake up task completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wake up task unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkboxBreakfast.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Breakfast task completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Breakfast task unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkboxClass.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Web programming class task completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Web programming class task unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkboxLunch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Lunch task completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Lunch task unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        checkboxHomework.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Homework task completed", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Homework task unchecked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
