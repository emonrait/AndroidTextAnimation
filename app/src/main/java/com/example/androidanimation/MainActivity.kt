package com.example.androidanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import yanzhikai.textpath.AsyncPathView
import yanzhikai.textpath.AsyncTextPathView
import yanzhikai.textpath.SyncTextPathView
import yanzhikai.textpath.TextPathView
import yanzhikai.textpath.painter.AsyncPathPainter
import java.nio.file.Path as Path1


class MainActivity : AppCompatActivity() {
    private lateinit var stpv_2017: SyncTextPathView
    private lateinit var atpv_1: AsyncTextPathView
    private lateinit var atpv_12: AsyncPathView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        atpv_1 = findViewById(R.id.atpv_1)
        stpv_2017 = findViewById(R.id.stpv_2017)
        atpv_12 = findViewById(R.id.atpv_12)

        atpv_1.startAnimation(0f, 1f)

        stpv_2017.startAnimation(1f, 0f)


    }
}