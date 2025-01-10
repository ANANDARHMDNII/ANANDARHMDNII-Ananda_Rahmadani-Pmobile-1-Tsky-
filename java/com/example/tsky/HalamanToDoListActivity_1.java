package com.example.tsky;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.nan.tsky.R;

public class HalamanToDoListActivity_1 extends AppCompatActivity {

    private ImageView profileImage;
    private TextView greetingText, toDoListText;
    private ImageView clockView;
    private CardView taskCard;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    private MaterialButton doneButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_to_do_list_1activity);

        // Initialize Views
        profileImage = findViewById(R.id.profile_image);
        greetingText = findViewById(R.id.greeting_text);  // Perbaiki ID
        toDoListText = findViewById(R.id.to_do_list_text);  // Perbaiki ID
        clockView = findViewById(R.id.clock_view);
        taskCard = findViewById(R.id.task_card);

        // Initialize CheckBoxes
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

        // Initialize Done Button
        doneButton = findViewById(R.id.done_button);

        // Set event listener for the Done button
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity when Done button is clicked
                navigateToNextActivity();
            }
        });
    }

    private void navigateToNextActivity() {
        // Create an Intent to start HalamanToDoListActivity2
        Intent intent = new Intent(HalamanToDoListActivity_1.this, HalamanToDoListActivity2.class);
        startActivity(intent);
    }
}
