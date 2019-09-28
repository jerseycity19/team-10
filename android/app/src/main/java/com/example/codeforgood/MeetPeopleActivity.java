package com.example.codeforgood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MeetPeopleActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_people);
        button = findViewById(R.id.searchMore);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindPeopleActivity.class);
            startActivity(intent);
        });
    }


}
