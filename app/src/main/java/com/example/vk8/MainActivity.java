package com.example.vk8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumberInput;
    EditText secondNumberInput;
    TextView textOutput;
    int firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberInput = findViewById(R.id.editFirstNumber);
        secondNumberInput = findViewById(R.id.editSecondNumber);
        textOutput = findViewById(R.id.textOutput);

    }

    public void plusCalculation(View view){
        firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int result = firstNumber + secondNumber;
        System.out.println("Tässä toimii.");
        textOutput.setText(Integer.toString(result));
    }

    public void minusCalculation(View view){
        firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int result = firstNumber - secondNumber;
        System.out.println("Tässä toimii.");
        textOutput.setText(Integer.toString(result));
    }

    public void ProductCalculation(View view){
        firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int result = firstNumber * secondNumber;
        System.out.println("Tässä toimii.");
        textOutput.setText(Integer.toString(result));
    }

    public void quotientCalculation(View view){
        firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int result = firstNumber / secondNumber;
        System.out.println("Tässä toimii.");
        textOutput.setText(Integer.toString(result));
    }
}