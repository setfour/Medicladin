package com.example.medicladin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private TextView cansel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cansel = findViewById(R.id.cansel);
        cansel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }

            public void toLogin() {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
                finish();
            }
        });
    }
}