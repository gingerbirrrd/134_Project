package com.example.a134;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp_Option extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_option);

        // STUDENT option button
        button = findViewById(R.id.student_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpFormStudent();
            }
        });

        // EMPLOYER option button
        button = findViewById(R.id.employer_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpFormEmployer();
            }
        });
    }

    // go to student menu
    public void openSignUpFormStudent() {
        Intent intent = new Intent(SignUp_Option.this, SignUpForm_Student.class);
        startActivity(intent);
    }

    // go to student menu
    public void openSignUpFormEmployer() {
        Intent intent = new Intent(SignUp_Option.this, SignUpForm_Employer.class);
        startActivity(intent);
    }
}
