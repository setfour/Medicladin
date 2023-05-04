package com.example.medicladin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView skip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        skip2 = findViewById(R.id.skip2);
        skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }

            public void toLogin() {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}