package com.ttest.fortest;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout = (ConstraintLayout) this.findViewById(R.id.B_activity);
        layout.setBackgroundColor(Color.BLACK);
        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Toast.makeText(Main2Activity.this, "OK吧", Toast.LENGTH_SHORT).show();
                button.setText("愚人節快樂");

            }
        });
    }

}
