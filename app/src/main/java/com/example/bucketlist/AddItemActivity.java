package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class AddItemActivity extends AppCompatActivity {

    private TextInputEditText title, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        title = findViewById(R.id.textInputEditTextTitle);
        description = findViewById(R.id.textInputEditTextDescription);

        Button button = findViewById(R.id.buttonAddItem);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("title", title.getText().toString());
                returnIntent.putExtra("description", description.getText().toString());

                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}
