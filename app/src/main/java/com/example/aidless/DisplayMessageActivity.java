package com.example.aidless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text = findViewById(R.id.textView2);
        text.setText(message);
        text.setAllCaps(true);
        Page testPage = new Page();
        Map<Resource, Integer> testMap = new HashMap<>();
        testMap.put(new Resource(), 1);
        testPage.endingReward(testMap);

    }

}