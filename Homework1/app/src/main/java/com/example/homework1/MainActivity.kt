package com.example.homework1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private var clickButton: Button? = null
    private var name: String = ""
    private var height: Int = 0
    private var weigth: Double = 0.0
    private var age: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<TextInputEditText>(R.id.et_name)
        val tiName = findViewById<TextInputLayout>(R.id.ti_name)
        etName.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                name = etName.text.toString().trim()
                if (name.isEmpty()) {
                    tiName.error = "Введите имя"
                } else if(name.length > 50) {
                    tiName.error = "Имя должно быть менее 50 символов"
                } else if(!name.matches("[a-zA-Zа-яА-Я]+".toRegex())){
                    tiName.error = "Имя должно содержать только буквы"
                } else {
                    tiName.error = null
                    etName.setText(name)
                }
            }
        }

        val etHeight = findViewById<TextInputEditText>(R.id.et_height)
        val tiHeight = findViewById<TextInputLayout>(R.id.ti_height)
        etHeight.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val text = etHeight.text.toString().trim()
                val heightOrNull: Int? = text.toIntOrNull()
                if (heightOrNull == null) {
                    tiHeight.error = "Введите рост"
                } else if(heightOrNull >= 250 || heightOrNull <= 0){
                    tiHeight.error = "Введите значение от 1 до 249"
                } else{
                    tiHeight.error = null
                    height = heightOrNull
                }
            }
        }

        val etWeight = findViewById<TextInputEditText>(R.id.et_weight)
        val tiWeight = findViewById<TextInputLayout>(R.id.ti_weight)
        etWeight.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val text = etWeight.text.toString().trim()
                val weightOrNull: Double? = text.toDoubleOrNull()
                if (weightOrNull == null) {
                    tiWeight.error = "Введите вес"
                } else if(weightOrNull >= 250 || weightOrNull <= 0){
                    tiWeight.error = "Введите значение от 1 до 249"
                } else{
                    tiWeight.error = null
                    weigth = weightOrNull
                }
            }
        }

        val etAge = findViewById<TextInputEditText>(R.id.et_age)
        val tiAge = findViewById<TextInputLayout>(R.id.ti_age)
        etAge.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val text = etAge.text.toString().trim()
                val ageOrNull: Int? = text.toIntOrNull()
                if (ageOrNull == null) {
                    tiAge.error = "Введите возраст"
                } else if(ageOrNull >= 150 || ageOrNull <= 0){
                    tiAge.error = "Введите значение от 1 до 149"
                } else{
                    tiAge.error = null
                    age = ageOrNull
                }
            }
        }

        val button = findViewById<Button>(R.id.buttonStart)
        val outputText = findViewById<TextView>(R.id.textResult)
        button.setOnClickListener {
            etName.clearFocus()
            etHeight.clearFocus()
            etWeight.clearFocus()
            etAge.clearFocus()
            if(name != "" && height != 0 && weigth != 0.0 && age != 0 ){
                outputText.setTextColor(Color.BLACK)
                val result: Double = (name.length + height + weigth + age) / 10
                outputText.text = "$name, Ваш процент по вкладу равен $result"
            } else{
                outputText.text = "Введите все данные!"
                outputText.setTextColor(Color.RED)
            }
        }
    }
}
