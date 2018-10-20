package com.adityakush24.arc;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
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
    TextView register,forgotPass,getStarted;
    ConstraintLayout constraintLayout;
    Animation slideup;
    EditText email,password,confPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        register = (TextView)findViewById(R.id.register);
        confPass = (EditText)findViewById(R.id.confirm_password);
        forgotPass = (TextView)findViewById(R.id.forgot_password);
        slideup = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        slideup.setAnimationListener(this);
        RippleBackground rippleBackground= findViewById(R.id.content);
        rippleBackground.startRippleAnimation();
        getStarted = findViewById(R.id.getStarted);
        register.setText("Don't have an account? Sign Up.");
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
                if(register.getText().equals("Don't have an account? Sign Up.")) {
                    Animation move = new TranslateAnimation(Animation.ABSOLUTE, Animation.ABSOLUTE, Animation.ABSOLUTE, -150);
                    Animation mov = new TranslateAnimation(Animation.ABSOLUTE, Animation.ABSOLUTE, Animation.ABSOLUTE, -150);
                    mov.setDuration(1000);
                    mov.setFillAfter(true);
                    move.setDuration(1000);
                    move.setFillAfter(true);
                    email.startAnimation(move);
                    password.startAnimation(mov);
                    confPass.setVisibility(View.VISIBLE);
                    confPass.startAnimation(slideup);
                    getStarted.setVisibility(View.GONE);
                    forgotPass.setVisibility(View.GONE);
                    loginButton.setBackgroundResource(R.drawable.sign_up_btn);
                    register.setText("Already have an account? Sign In.");
                }
                else {
                    Animation move = new TranslateAnimation(Animation.ABSOLUTE, Animation.ABSOLUTE, Animation.ABSOLUTE, 0);
                    move.setDuration(1500);
                    move.setFillAfter(true);
                    email.startAnimation(move);
                    password.startAnimation(move);
                    confPass.setVisibility(View.GONE);
                    forgotPass.setVisibility(View.VISIBLE);
                    loginButton.setBackgroundResource(R.drawable.loginbtn);
                    register.setText("Don't have an account? Sign Up.");
                }
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