package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercise2Activity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercise2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calculate(View v){
        EditText editTextValue1 = findViewById(R.id.editTextValue1);
        EditText editTextValue2 = findViewById(R.id.editTextValue2);
        textViewResult = findViewById(R.id.textViewResult);


        Button clickedButton = (Button) v;
        String buttonText = clickedButton.getText().toString();


        String value1Str = editTextValue1.getText().toString();
        String value2Str = editTextValue2.getText().toString();


        if (value1Str.isEmpty() || value2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return;
        }


        double value1 = Double.parseDouble(value1Str);
        double value2 = Double.parseDouble(value2Str);
        double result = 0;


        switch (buttonText) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "X":
                result = value1 * value2;
                break;
            case "/":

                if (value2 == 0) {
                    textViewResult.setText("Cannot divide by zero");
                    return;
                }
                result = value1 / value2;
                break;
        }



        textViewResult.setText(Double.toString(result));

    }
}