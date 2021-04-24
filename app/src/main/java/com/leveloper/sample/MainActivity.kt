package com.leveloper.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leveloper.daterangepicker.DateRangePicker
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = Calendar.getInstance().apply { timeInMillis = 0 }
        val end = Calendar.getInstance()
//
        findViewById<DateRangePicker>(R.id.drp).init(start, end)
    }
}