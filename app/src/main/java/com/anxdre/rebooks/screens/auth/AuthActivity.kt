package com.anxdre.rebooks.screens.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anxdre.rebooks.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppThemeNoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}
