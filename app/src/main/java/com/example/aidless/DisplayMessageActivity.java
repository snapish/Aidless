package com.example.aidless;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class DisplayMessageActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text = findViewById(R.id.textView2);
        text.setText(message);
        text.setAllCaps(true);
        Page p = new Page();
        Chapter c = new Chapter(p);
        Book b = new Book(c);
        Resource r = new Resource(b);
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put(r.name, 1);
        p.endingReward(testMap);
    }
}