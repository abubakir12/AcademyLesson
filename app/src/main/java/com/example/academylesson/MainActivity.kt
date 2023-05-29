package com.example.academylesson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.academylesson.collection.collectionClassWork
import com.example.academylesson.collection.collectionHomeWork


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //    IfElseHomeWork()
     //   For_wile()
        collectionHomeWork()
        val collection = collectionClassWork()
      //  ArraysClassWork1()
     //   ArraysClassWork1()
//        var zagalovok: String = "Instagram"
//        Log.i("AndroidAcademy", zagalovok)
//        zagalovok = "Telegram"
//        Log.i("AndroidAcademy", zagalovok)
//
//
//        val age: Int = 19
//        val age1: String = "35"
//        val year: Int = 5
//
//        val sum = age + year
//        Log.i("AndroidAcademy", sum.toString())
//
//
//        val IntNumber = 4
//        val shortNumber = 4
//        val LongNumber = 42434242
//
//        val isRight: Boolean = true
//
//
//        val a: Int = 100
//
//        val b: Int = 100
//        val check = a == b


        // домашняя работа


        //bayt-это переменное которое содержит в себя чисел от -128 до +127 и весит 1 байт

        // double-это переменное для плавующих символов например 10.5  весит он 8 байта

        // Integer-это переменная те которое мы используем для чисел не менее 2147483648  и он весит 4 байта

        // Float - это переменная которая используется для чисел и для символов типа 74.10f
        // и весит он 4 байта

        // Long - это переменная тоже похожа на integer используется для чисел не больше
        // 9223372036854775808 - весит он 8 байтов

        // short-это переменная который содержит в себя от -32768 до +32767 но похож на Integer но short по сравнению
        //Integer принимает в себя меньше символов чем Integer. short 2 байта

        // char - это переменая которая не совмещает в себя более однога число или буквы

        // String - это переменная которая мы можем использовать и с числами и с текстами и весит он
        // примерно 4 байта используется чтобы представить и конструировать последовательность символов.

        //boolean - это переменная которя содержит в себя только 2 значени true and folse


        // var name: String = "abubakir"
        //  var lastName: String = "payzulloev"
        //var age: Short = 17
        //  val gender: String = "middle"
        //   Log.i("AbubakirInfo", "$name + $lastName + $age + $gender")


    }
}