package com.example.a44444

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView2)
        imageView1 = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)
        var imageButton: ImageButton = findViewById(R.id.imageButton3)
        var editText: EditText = findViewById(R.id.editTextText2)
        var editText2: EditText = findViewById(R.id.editTextText3)

        imageView1.visibility = View.INVISIBLE
        imageView2.visibility = View.INVISIBLE
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello, friend"
            } else {
                textView.text = "Hello, " + editText.text
            }
                if (editText2.text.toString() == "okay") {
                    imageView1.visibility = View.VISIBLE
                    imageView2.visibility = View.INVISIBLE
                }
                if (editText2.text.toString() == "bad") {
                    imageView2.visibility = View.VISIBLE
                    imageView1.visibility = View.INVISIBLE
                }

        }
    }
}