package com.example.cursomoure

import android.content.ContentValues.TAG
import android.util.Log


//se define los atributos de la clase en los parametros el tipo de dato y ?
//si puede venir null pero si no le doy un valor por defecto estoy obligado
//a cargarlo cuando instancie.
class MyClass(var name: String , var age: Int,
              var languages: Array<String>,
              var friends: Array<MyClass>?=null) {

    fun code(){
        for (language in languages){
            Log.e(TAG,language)
        }

    }
}