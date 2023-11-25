package com.example.cursomoure

import android.content.ContentValues.TAG
import android.util.Log

class Programmer(val name:String,val age:Int, val language: String? =null): Person(name,age) {

    /*para hacer override de una funcion heredada la funcion tiene que tener
    ser open de lo contrario no podemos acceder en el padre hay que poner
    open fun work*/
    //para poder acceder a los atributos hay que definirilos ademas con val o var
    override fun work() {


        Log.e(TAG, "EL PROGRAMADOR ESTA TRABAJANDO, su lenguaje es  $language , su nombre $name" +
                "su edad $age" )

    }

}