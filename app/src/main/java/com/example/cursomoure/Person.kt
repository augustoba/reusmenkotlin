package com.example.cursomoure

import android.content.ContentValues.TAG
import android.util.Log

open class Person(name:String, age: Int):Work() {

   open fun work(){

        Log.e(TAG,"ESTA TRABAJANDO")
    }

    override fun goToWork() {
        Log.v(TAG,"VA A TRABAJAR")
    }

}