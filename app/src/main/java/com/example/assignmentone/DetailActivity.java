package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Activity to give details about the subject which was clicked in MainActivity
 * @author Alex Thorrold
 */
public class DetailActivity extends AppCompatActivity {

    /**
     * Sets the image view, title text view, and content text view to match selected subject
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // DetailActivity views to set content for
        ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewContent = findViewById(R.id.textViewContent);

        // Gets the index of the image button pressed
        Intent intent = getIntent();
        int index = intent.getIntExtra(MainActivity.INDEX, -1);

        // Only sets content if a DetailActivity was called due to a button being pressed
        // (this should be the only way to call DetailActivity)
        if (index >= 0) {
            // Set the image view to have the image relating to the image button pressed
            String imgName = getResources().getStringArray(R.array.string_array_banners)[index];
            int imgId = getResources().getIdentifier(imgName, "drawable", getPackageName());
            Drawable d = getDrawable(imgId);
            imageViewDetail.setImageDrawable(d);

            // Set the title text view to have the title relating to the image button pressed
            String title = getResources().getStringArray(R.array.string_array_titles)[index];
            textViewTitle.setText(title);

            // Set the content text view to have the content relating to the image button pressed
            String content = getResources().getStringArray(R.array.string_array_content)[index];
            textViewContent.setText(content);
        }
    }
}