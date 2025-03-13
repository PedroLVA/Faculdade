package com.example.exercicios;

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

public class Exercise1Activity extends AppCompatActivity {
    private EditText editTextName, editTextAge;
    private Button buttonCheck;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise1);


        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonCheck = findViewById(R.id.buttonCheck);
        textViewResult = findViewById(R.id.textViewResult);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void calculateAge(View v){
        String name = editTextName.getText().toString();
        String ageStr = editTextAge.getText().toString();

        if (name.isEmpty() || ageStr.isEmpty()) {
            textViewResult.setText("Please enter both name and age");
            return;
        }

        int age = Integer.parseInt(ageStr);
        boolean isAdult = age >= 18;

        String resultText = name + (isAdult ? " is an adult" : " is not an adult");
        textViewResult.setText(resultText);
    }
}