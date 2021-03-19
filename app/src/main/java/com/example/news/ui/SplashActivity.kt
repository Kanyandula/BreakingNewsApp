package com.example.news.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.news.R
import com.example.news.util.Constants.Companion.SPLASH_DELAY


class SplashActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    NewsActivity::class.java


                )
            )
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up)
            finish()
        }, SPLASH_DELAY)


    }


}





