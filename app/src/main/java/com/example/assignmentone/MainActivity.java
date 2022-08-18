package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Main activity which gives the user options to view different subjects
 * @author Alex Thorrold
 */
public class MainActivity extends AppCompatActivity {

    public static final String INDEX = "index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens DetailActivity when one of the image buttons is clicked
     * @param view The image button that was clicked
     */
    public void onClickImageButton(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(INDEX, Integer.parseInt((String) view.getTag()));
        startActivity(intent);
    }
}