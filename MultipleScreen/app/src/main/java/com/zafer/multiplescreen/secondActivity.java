package com.zafer.multiplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String unerName = intent.getStringExtra("usernameInput");
        textView.setText(unerName);
    }
    public void changeToScreen(View view){
        Intent intent = new Intent(secondActivity.this , MainActivity.class);
        startActivity(intent);
    }
}