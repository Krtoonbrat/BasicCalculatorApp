package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);
        textView = (TextView) findViewById(R.id.ResultText);
        Intent intent = getIntent();
        String str = intent.getStringExtra("Message");
        textView.setText("Result: " + str);
    }

    public void goToActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void clickDone(View view) {
        goToActivity();
    }
}