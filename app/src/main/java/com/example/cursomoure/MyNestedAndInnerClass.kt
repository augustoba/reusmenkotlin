package com.example.cursomoure

import android.content.ContentValues.TAG
import android.util.Log

class MyNestedAndInnerClass {
    private val one = 1

    private fun return0ne(): Int {
        return one
    }

    //clase anidada no puede acceder a valores de la clase principal
    class MyNestedClass{

        fun sum (first: Int , second: Int): Int{
            return first + second //+ one
        }
    }

    //clase interna con inner se especifica que es interna y puede acceder a valores
    //de la clase principal o  clase que lo contiene

    inner class MyInnerClass {

        fun sumTwo(number : Int) :Int{
            val result=number+ one + return0ne()
            Log.v(TAG, result.toString())
            return result

        }
    }
}