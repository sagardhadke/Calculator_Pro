package net.uniquecomputer.calculatorpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        // hide support action bar
        supportActionBar?.hide()

        //Go to Splash Screen
        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3500)
    }
}