package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise3Activity extends AppCompatActivity {

    private EditText editTextName, editTextAge, editTextUF, editTextCity, editTextPhone, editTextEmail;
    private RadioGroup radioGroupSize;
    private CheckBox checkBoxRed, checkBoxBlue, checkBoxGreen, checkBoxYellow;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        // Inicializa os componentes
        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextUF = findViewById(R.id.editTextUF);
        editTextCity = findViewById(R.id.editTextCity);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
        radioGroupSize = findViewById(R.id.radioGroupSize);
        checkBoxRed = findViewById(R.id.checkBoxRed);
        checkBoxBlue = findViewById(R.id.checkBoxBlue);
        checkBoxGreen = findViewById(R.id.checkBoxGreen);
        checkBoxYellow = findViewById(R.id.checkBoxYellow);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void registerUser(View view) {

        String name = editTextName.getText().toString();
        String age = editTextAge.getText().toString();
        String uf = editTextUF.getText().toString();
        String city = editTextCity.getText().toString();
        String phone = editTextPhone.getText().toString();
        String email = editTextEmail.getText().toString();


        if (name.isEmpty() || age.isEmpty() || uf.isEmpty() || city.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Preencha todos os campos obrigatórios", Toast.LENGTH_SHORT).show();
            return;
        }


        int selectedSizeId = radioGroupSize.getCheckedRadioButtonId();
        RadioButton selectedSize = findViewById(selectedSizeId);
        String size = selectedSize != null ? selectedSize.getText().toString() : "Nenhum tamanho selecionado";


        StringBuilder colors = new StringBuilder();
        if (checkBoxRed.isChecked()) colors.append("Vermelho, ");
        if (checkBoxBlue.isChecked()) colors.append("Azul, ");
        if (checkBoxGreen.isChecked()) colors.append("Verde, ");
        if (checkBoxYellow.isChecked()) colors.append("Amarelo, ");
        if (colors.length() > 0) colors.setLength(colors.length() - 2); // Remove a última vírgula

        Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
    }
}