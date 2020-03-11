package com.example.a134;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.a134.StudentActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
        }
    };

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1 = findViewById(R.id.rellay1);

        handler.postDelayed(runnable, 2000);

        // LOGIN button
        button = findViewById(R.id.signin_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentActivity();
            }
        });
    }

    public void openStudentActivity() {
        Intent intent = new Intent(MainActivity.this, StudentActivity.class);
        startActivity(intent);
    }
}


/**
 * references:
 * login page: https://www.youtube.com/watch?v=-7xLyPLJ_NI
 * navigation drawer: https://www.youtube.com/watch?v=fGcMLu1GJEc
 */

// commit trial
