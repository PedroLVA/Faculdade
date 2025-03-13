package com.example.exercicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private Button buttonCheck;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize views AFTER setContentView
        // Initialize buttons
        Button buttonExercise1 = findViewById(R.id.buttonExercise1);
        Button buttonExercise2 = findViewById(R.id.buttonExercise2);
        Button buttonExercise3 = findViewById(R.id.buttonExercise3);
        Button buttonExercise4 = findViewById(R.id.buttonExercise4);
        Button buttonExercise5 = findViewById(R.id.buttonExercise5);
        Button buttonExercise6 = findViewById(R.id.buttonExercise6);
        Button buttonExercise7 = findViewById(R.id.buttonExercise7);

        buttonExercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise1Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise2Activity.class);
                startActivity(intent);
            }
        });

        // Similarly add onClick listeners for buttons 3-7
        buttonExercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise3Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise4Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise5Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise6Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise7Activity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}