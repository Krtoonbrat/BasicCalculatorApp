package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionAdd (View view) {
        EditText right = (EditText) findViewById(R.id.RightInt);
        EditText left = (EditText) findViewById(R.id.LeftInt);

        try {
            int rhs = Integer.parseInt(right.getText().toString());
            int lhs = Integer.parseInt(left.getText().toString());
            int result = rhs + lhs;
            goToActivity(Integer.toString(result));
        }
        catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }

    }
    public void clickFunctionSubtract (View view) {
        EditText right = (EditText) findViewById(R.id.RightInt);
        EditText left = (EditText) findViewById(R.id.LeftInt);

        try {
            int rhs = Integer.parseInt(right.getText().toString());
            int lhs = Integer.parseInt(left.getText().toString());
            int result = rhs - lhs;
            goToActivity(Integer.toString(result));
        }
        catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }

    }

    public void clickFunctionMultiply (View view) {
        EditText right = (EditText) findViewById(R.id.RightInt);
        EditText left = (EditText) findViewById(R.id.LeftInt);

        try {
            int rhs = Integer.parseInt(right.getText().toString());
            int lhs = Integer.parseInt(left.getText().toString());
            int result = rhs * lhs;
            goToActivity(Integer.toString(result));
        }
        catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }

    }

    public void clickFunctionDivide (View view) {
        EditText right = (EditText) findViewById(R.id.RightInt);
        EditText left = (EditText) findViewById(R.id.LeftInt);

        try {
            int rhs = Integer.parseInt(right.getText().toString());
            int lhs = Integer.parseInt(left.getText().toString());
            int result = rhs / lhs;
            goToActivity(Integer.toString(result));
        }
        catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        }

    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("Message", s);
        startActivity(intent);
    }
}