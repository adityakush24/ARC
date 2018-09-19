package com.adityakush24.arc;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RippleBackground rippleBackground= findViewById(R.id.content);
        rippleBackground.startRippleAnimation();

    }
}