package com.peculiaruc.hngzuriproject

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btnInput: Button
    private lateinit var nameEditTest: EditText
    private lateinit var emailEditText:EditText
    private lateinit var textViewDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnInput = findViewById<View>(R.id.click) as Button
        textViewDisplay = findViewById<View>(R.id.display) as TextView
        textViewDisplay.movementMethod = ScrollingMovementMethod()

        btnInput.setOnClickListener {
            nameEditTest = findViewById<View>(R.id.name) as EditText
            emailEditText = findViewById<View>(R.id.email) as EditText

            textViewDisplay.text =
                """
               
                    ${nameEditTest.text}
                    
                    ${emailEditText.text}
                    
                    """.trimIndent()
        }
    }


}