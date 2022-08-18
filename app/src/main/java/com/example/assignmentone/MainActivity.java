package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Main activity which gives the user options to view different subjects
 * @author Alex Thorrold
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * TODO
     * @param view
     */
    public void onClick(View view) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }
}