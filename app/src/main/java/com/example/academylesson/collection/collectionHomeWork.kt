package com.example.academylesson.collection

import android.util.Log

class collectionHomeWork {
    init {

    }



            class CollectionsHomeWork {
                init {
                    //task1()
                    //task2()
                    //task4()
                    //task5()
                    task6()
                    //task7()
                    //task8()
                }
                private fun task1() {
                    val mutableList = mutableListOf<Int>()
                    for (i in 0..4){
                    }

                }
                private fun task2(){
                    val mutableList1= mutableListOf<Int>(12,15,16,9,7,1,10)
                    var sum = 0
                    for (i in mutableList1){
                        if (i % 3 ==0){
                            sum += i
                            Log.i("abubakir", i.toString())
                        }
                    }
                }
                private fun task4(){
                    val mutableList2= mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                    for(i in mutableList2){
                        if (i %2==0){
                            Log.i("abubakir", i.toString()
                            )
                        }
                    }
                }

                private fun task5(){
                    val map = mutableMapOf<Int, Int>()
                    map.put(1,1)
                    map.put(2,4)
                    map.put(3,9)
                    map.put(4,16)
                    map.put(5,25)
                    val one = map[1]
                    val two = map[2]
                    val third = map[3]
                    val four = map[4]
                    val five = map[5]
                    Log.i("abubakir", four.toString())
                }
                private fun task6(){
                    val mutableList= mutableListOf<String>()
                    mutableList.add("«Чем умнее человек, тем легче он признает себя дураком». Альберт Эйнштейн")
                    mutableList.remove("а")
                    Log.i("abubakir", mutableList.toString())

                }
                private fun task7(){
                    val mutableList = mutableListOf<Int>(100,90,80,70,45,65,82,74,12,22,20,31,0)
                    mutableList.sort()
                    Log.i("abubakir", mutableList.toString())
                }

                private fun task8(){
                    val mutableList = mutableListOf<Int>(100,90,80,70,45,65,82,74,12,22,20,31,0)
                    //Log.i("AbuAcademy",mutableList.max().toString())
                    Log.i("abubakir",mutableList.min().toString())
                }
            }
            }




