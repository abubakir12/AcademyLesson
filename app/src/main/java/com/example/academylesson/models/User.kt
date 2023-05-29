package com.example.academylesson.models

data class User (
    val name: String,
    val lastName:String,
    val email:String,
    val password:String,
    val isAuth:Boolean,
        ){
    companion object{

        fun unknown()=User(
            name = String(),
            lastName = String(),
            email = String(),
            password = String(),
            isAuth = false
        )

    }
}


