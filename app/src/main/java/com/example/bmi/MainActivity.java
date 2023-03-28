package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputEditText height;
    TextInputEditText weight;

    TextInputEditText bmiValue;

    Button calButton;
    Button clButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.weightId);
        weight = findViewById(R.id.heigthId);

        bmiValue = findViewById(R.id.bmiValue);

        calButton = findViewById(R.id.buttonCaculate);
        clButton = findViewById(R.id.buttonClear);


        calButton.setOnClickListener(v -> {

            double we = Double.parseDouble(height.getText().toString());
            double he = Double.parseDouble(weight.getText().toString());
            double result = (we / (he/100 * he/100));
            bmiValue.setText(Double.toString(Math.round(result)));

        });

        clButton.setOnClickListener(v -> {
            height.setText("");
            weight.setText("");
            bmiValue.setText("");
        });
    }
}