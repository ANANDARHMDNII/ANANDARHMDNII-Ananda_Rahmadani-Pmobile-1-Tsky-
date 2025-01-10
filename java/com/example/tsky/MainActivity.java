package com.example.tsky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.nan.tsky.R;

public class MainActivity extends AppCompatActivity {

    private TextView profileText, addProfileText, prepareText, dailyTasksText;
    private ImageView profilePlaceholder, addTaskIcon;
    private MaterialButton createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        profileText = findViewById(R.id.profile_text);
        addProfileText = findViewById(R.id.add_profile_text);
        prepareText = findViewById(R.id.prepare_text);
        dailyTasksText = findViewById(R.id.daily_tasks_text);
        profilePlaceholder = findViewById(R.id.profile_placeholder);
        addTaskIcon = findViewById(R.id.add_task_icon);
        createButton = findViewById(R.id.create_button);

        // Add click listeners
        profilePlaceholder.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Profile placeholder clicked!", Toast.LENGTH_SHORT).show()
        );

        addTaskIcon.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Add task icon clicked!", Toast.LENGTH_SHORT).show()
        );

        createButton.setOnClickListener(v -> {
            // Navigate to HalamanToDoList1Activity_1
            Intent intent = new Intent(MainActivity.this, HalamanToDoListActivity_1.class);
            startActivity(intent);
        });
    }
}
