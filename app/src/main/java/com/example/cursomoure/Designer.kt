package com.example.cursomoure

import android.content.ContentValues.TAG
import android.util.Log

class Designer(name:String,age: Int): Person(name,age) {

    override fun work() {
        //aqui se hace un override de la funcion original
        Log.e(TAG,"EL DISEñADOR ESTA DISEñANDO")
        //ademas con super se invoca a la original
        super.work()
    }
}