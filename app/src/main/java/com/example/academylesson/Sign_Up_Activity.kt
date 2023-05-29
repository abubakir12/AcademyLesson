package com.example.academylesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylesson.databinding.ActivitySignUpBinding

class Sign_Up_Activity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.createButtonText.setOnClickListener {
            val firstNameText=binding.firstNameText.text.toString()
            val lastNameText=binding.lastNameText.text.toString()
            val emmailNameText=binding.emmailText.text.toString()
            val passwordNameText=binding.passwordText.text.toString()

            when{
                firstNameText.isEmpty()-> {
                    showToast("Заполните поле для ввода имени")
                }
                lastNameText.contains() -> {
                    showToast("заполните поле для ввода фамилии")
                }
                emmailNameText.contains("@gmail.com")->{
                    showToast("Заполните поле для ввода пароля")
                }
                passwordNameText.length<= 8 ->{
                    showToast("пароль должен содержать не менее 8 символов")
                }
                else->{
                    showToast("все правильно")
                }
            }
        }

    }

    private fun showToast(s: String) {


    }
}

private fun String.contains(): Boolean {
    TODO("Not yet implemented")
}
