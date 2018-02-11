package com.example.admin.nekotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.example.admin.nekotlin.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StrictMath.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        test.setText("Hello, world!")
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        if (event.) {
            test.setTextColor(intArrayOf(0xff0000ff.toInt(), 0xffff0000.toInt(), 0xff00ff00.toInt())[(random() * 100).toInt() % 3])
//        }
        return true
    }
}
