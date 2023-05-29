package com.example.academylesson.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylesson.MusicPlayerActivity
import com.example.academylesson.MusikListActivity
import com.example.academylesson.R
import com.example.academylesson.models.User

class SplashActivity : AppCompatActivity() {

    private val userCache:UserCacheManager by lazy {
        UserCacheManager(this)
    }
    private val user :User by lazy {
        userCache.getUser() ?: User.unknown()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    val intent=  if (user.isAuth){
        Intent(this,MusikListActivity ::class.java)
    }else{
        Intent(this,MusicPlayerActivity::class.java)
    }

        startActivity(intent)



    }
}