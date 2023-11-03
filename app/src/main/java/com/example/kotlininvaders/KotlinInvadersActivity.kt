package com.example.kotlininvaders

import android.os.Bundle
import android.app.Activity
import android.graphics.Point
import androidx.activity.ComponentActivity

class KotlinInvadersActivity : ComponentActivity() {

    private var kotlinInvadersView: KotlinInvadersView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)

        kotlinInvadersView = KotlinInvadersView(this, size)
        setContentView(kotlinInvadersView)
    }

    override fun onResume() {
        super.onResume()

        kotlinInvadersView?.resume()
    }

    override fun onPause() {
        super.onPause()

        kotlinInvadersView?.pause()
    }
}
