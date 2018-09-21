package com.adityakush24.arc;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ebanx.swipebtn.OnActiveListener;
import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;
import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    SwipeButton enableButton;
    Button loginButton;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RippleBackground rippleBackground= findViewById(R.id.content);
        rippleBackground.startRippleAnimation();
        /*constraintLayout = findViewById(R.id.login_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();*/
        enableButton = findViewById(R.id.swipe_btn);
        loginButton = findViewById(R.id.login_btn);
        enableButton.setOnActiveListener(new OnActiveListener() {
            @Override
            public void onActive() {
                loginButton.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void isWorking(View view)
    {
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }
}