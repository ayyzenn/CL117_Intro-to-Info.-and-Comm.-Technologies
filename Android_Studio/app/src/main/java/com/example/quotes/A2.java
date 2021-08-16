package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class A2 extends AppCompatActivity {
    public Button btn1 ;
    public Button btn2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        btn1 = (Button) findViewById(R.id.button_1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2.this, A3.class);
                startActivity(intent);
            }
        });
        btn2 = (Button) findViewById(R.id.button_2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2.this, A4.class);
                startActivity(intent);
            }
        });
    }
}