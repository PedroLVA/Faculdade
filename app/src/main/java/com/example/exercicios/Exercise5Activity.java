package com.example.exercicios;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise5Activity extends AppCompatActivity {

    private CheckBox checkBoxNotifications, checkBoxDarkMode, checkBoxRememberLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);


        checkBoxNotifications = findViewById(R.id.checkBoxNotifications);
        checkBoxDarkMode = findViewById(R.id.checkBoxDarkMode);
        checkBoxRememberLogin = findViewById(R.id.checkBoxRememberLogin);
    }

    public void onSavePreferencesClick(View view) {

        StringBuilder selectedPreferences = new StringBuilder();

        if (checkBoxNotifications.isChecked()) {
            selectedPreferences.append("Receber notificações\n");
        }
        if (checkBoxDarkMode.isChecked()) {
            selectedPreferences.append("Modo escurro\n");
        }
        if (checkBoxRememberLogin.isChecked()) {
            selectedPreferences.append("Lembrar login\n");
        }
        if (selectedPreferences.length() > 0) {
            Toast.makeText(this, "Preferencias selecionadas:\n" + selectedPreferences.toString(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
        }
    }
}