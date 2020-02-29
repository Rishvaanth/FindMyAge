package com.rishvaanth.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            buttonClick()
        }
    }

    fun buttonClick(){
        val DOB = Integer.parseInt(editDateofBirth.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeinYears = currentYear-DOB
        result.text = "You are $userAgeinYears"
    }
}
