package com.example.academylesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.example.academylesson.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.enterButton.setOnClickListener{
            val loginText = binding.loginEditText.text.toString()
            val passwordText =binding.passwordEditText.text.toString()
            when{
                loginText.isEmpty()-> {
                    showToast(getString(R.string.Fill_in_the_login_input_field))
                }
                !loginText.contains("@gmail.com")->{
                    showToast("неправильный ввод логина")
                }
                passwordText.isEmpty()->{
                    showToast("Заполните поле для ввода пароля")
                }
                passwordText.length<= 8 ->{
                    showToast("пароль должен содержать не менее 8 символов")
                }
                else->{
                    navigateToMusicListActivity()
                }
            }
        }
    }
    private fun navigateToMusicListActivity(){
        val intent=Intent(this,MusikListActivity::class.java)
        Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }


    private fun showToast(message:String){
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}