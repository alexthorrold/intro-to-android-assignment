package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickComputerScience(View view) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }

    public void onClickDesign(View view) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }

    public void onClickMath(View view) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }

    public void onClickSoftwareEngineering(View view) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }
}