package com.example.palindromecheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(View.OnClickListener { view ->
            var text = inputText.text

            if (checkPalindrome(text.toString())) {
                textView.setText("Palindrome")
            } else {
                textView.setText("Not Palindrome")
            }
        })

    }

    fun checkPalindrome(str: String): Boolean{
        val value = str.toLowerCase().replace("""[\W+]""".toRegex(), "")
        return value.reversed() == value
    }


}