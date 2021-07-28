package com.pedrolemoz.findmyage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.calculateButton)

        calculateButton.setOnClickListener { onButtonClick() }

    }

    @SuppressLint("SetTextI18n")
    fun onButtonClick() {
        val birthDateTextField: EditText = findViewById(R.id.birthDateTextField)
        val ageText: TextView = findViewById(R.id.ageText)

        val dateOfBirth = Integer.parseInt(birthDateTextField.text.toString())
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - dateOfBirth

        ageText.text = "You are $age years old"
    }

}
