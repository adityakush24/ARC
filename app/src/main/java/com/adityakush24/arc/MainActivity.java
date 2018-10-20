package com.adityakush24.arc;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ebanx.swipebtn.OnActiveListener;
import com.ebanx.swipebtn.SwipeButton;
import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    SwipeButton enableButton;
    Button loginButton;
    TextView register;
    ConstraintLayout constraintLayout;
    Animation slideup;
    EditText email,username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = (TextView)findViewById(R.id.register);
        slideup = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        slideup.setAnimationListener(this);
        RippleBackground rippleBackground= findViewById(R.id.content);
        rippleBackground.startRippleAnimation();

        /*constraintLayout = findViewById(R.id.login_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();0
        enableButton = findViewById(R.id.swipe_btn);
        */
        loginButton = (Button)findViewById(R.id.loginbtn);
      /*  enableButton.setOnActiveListener(new OnActiveListener() {
            @Override
            public void onActive() {
                loginButton.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });*/
      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              loginButton.setVisibility(View.VISIBLE);
              loginButton.startAnimation(slideup);
          }
      });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}