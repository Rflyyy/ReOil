package com.example.reoil

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reoil.Onboarding.OnboardingActivity

class SplashScreen : AppCompatActivity() {

    private lateinit var topAnimation: Animation
    private lateinit var buttomAnimation: Animation
    private lateinit var imageGithub: ImageView
    private lateinit var imageLogo : ImageView
    private lateinit var slogan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed({
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        buttomAnimation = AnimationUtils.loadAnimation(this, R.anim.buttom_animation)

        imageGithub = findViewById(R.id.github_icon)
        imageLogo = findViewById(R.id.github_icon_text)

        imageGithub.startAnimation(topAnimation)
        imageLogo.startAnimation(buttomAnimation)
    }
}