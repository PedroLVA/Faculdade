package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise4Activity extends AppCompatActivity {

    private EditText editTextName;
    private LinearLayout linearLayoutCheckboxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);


        editTextName = findViewById(R.id.editTextName);
        linearLayoutCheckboxes = findViewById(R.id.linearLayoutCheckboxes);
    }

    public void onConfirmButtonClick(View view) {

        linearLayoutCheckboxes.removeAllViews();


        String name = editTextName.getText().toString().trim();


        if (name.isEmpty()) {
            Toast.makeText(this, "Digite um nome váido", Toast.LENGTH_SHORT).show();
            return;
        }


        for (char letter : name.toCharArray()) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(letter));
            linearLayoutCheckboxes.addView(checkBox);
        }
    }
}