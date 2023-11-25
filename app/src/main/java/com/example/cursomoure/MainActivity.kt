package com.example.cursomoure

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //ejemplo("augusto", "basaury", 35)
        //sentenciaWhen();
       // notasWhen()
        //arrays()
        //maps()
       // loops()
       // nullSafety()
       //Log.i(TAG,funciones(3,null))
       // classes()
       // enumClass()
    }



    fun ejemplo(nombre:String, apellido :String, edad :Int){
        Log.i(TAG,"mi nombre es $nombre $apellido y mi edad $edad")


    }

    fun sentenciaWhen(){
        val country = "asd"

        when(country){
            "españa" -> Log.e(TAG, "EL IDIOMA ES ESPAñOL ESPAñA")
            "argentina" -> Log.e(TAG, "EL IDIOMA ES ESPAñOL argentina")
            else -> Log.e(TAG, "NO SE ENCONTRO EL IDIOMA")
         }
    }

    fun notasWhen(){
        val nota = 0

        when(nota){
                in 0..5-> Log.e(TAG, "desaprobado")
            in 6..10 -> Log.e(TAG, "aprobado")
            else -> Log.e(TAG, "NO SE ENCONTRO la nota")
        }
    }


    fun arrays(){

        val name= "augusto"
        val lastName= "basaury"
        val age= "35"

        val arreglo = arrayListOf<String>()
        arreglo.add(name)
        arreglo.add(lastName)
        arreglo.add(age)
        // todos a la vez
        arreglo.addAll(listOf(name,lastName,age))
       Log.d(TAG,arreglo.toString())
        Log.d(TAG,arreglo[0])
        arreglo.removeAt(1)
        arreglo.forEach {
            Log.i(TAG,it + "en el foreach")
        }
    for (aux in arreglo){

        Log.e(TAG,aux + " en el for")
    }
}

    fun maps(){

        val name= "augusto"
        val lastName= "basaury"
        val age= "35"

        var myMap: Map<String,Int> = mapOf()

        Log.i(TAG,myMap.toString())
        println()

        //mapof no se puede agregar mas valores de los que se declararon
        //mutablemapof se puede modificar
        myMap = mutableMapOf(name to 1, lastName to 2 , age to 3)
        Log.i(TAG,myMap.toString())
            myMap.put("maria",8)

        Log.i(TAG,myMap.toString()+ "depsues de agregar")

        //acceder a un valor
        Log.i(TAG,(myMap[name].toString() + "acceder al valor"))
    }

    fun loops (){
        val arreglo = arrayListOf<String>("augusto","juan","pedro")
        val myMap : MutableMap<String,Int> = mutableMapOf("augusto" to 1, "juan" to 2, "pedro" to 14)

        // for
        for (aux in arreglo){
          //  Log.e(TAG, aux)
            println(aux)
        }

        //map
        for (aux:MutableMap.MutableEntry<String,Int> in myMap){
            Log.v(TAG,("${aux.key} ${aux.value}  dentro del formap"))

        }

        // for con rango
        // se agrega el rango 0..10 esto indica que abarca el 10 osea itera 11
        //con until indica que va desde 0 sin el ultimo numero
        //con step 2 le indicamos que el paso sea de a 2
        //si queremos ir para atras seria downTo en vez de until  o de ..
        for (x in 0 until arreglo.size step 2){
            Log.e(TAG,arreglo[x] + " ..for con rango")
        }

        //while
        var x= 0
        while (x <10){
            x ++
            Log.e(TAG,x.toString() + " desde while")

        }

    }

    fun nullSafety(){
        //nulls
        //!! se usa para asegurar que no es null
        //algunas veces el ide te va a decir que puede ser null esa variable y no vas a poder
        //realizar algunas operaciones pero si estamos seguros de que en ese punto no es null
        //le agregamos !!
        //cuando queremos realizar una operacion con esa variable ej el length se le agrega
        //? que indica que si es null no la haga y nos devuelva un null y no corta el codigo.

        var myString : String ? ="augusto"
        Log.e(TAG,myString.toString())
        myString= null
        if (myString !=null){
            Log.e(TAG, myString)
        }else{
            Log.e(TAG,myString!!)
        }

        Log.e(TAG,myString?.length.toString())
    }


    //ahi espera un numero Int y un sring ademas pueden ser null con ?
    //tambien tiene retorno se indica con : al final de la funcion y el tipo de dato.
     fun funciones(numero:Int?,saludo:String?):String {

         for (x in 0 until numero!!) {
             Log.e(TAG, "hola  $saludo")
         }
        return  numero.toString()
    }

    fun classes(){
        val augusto = MyClass("augusto",35, arrayOf("java","react"))

        Log.i(TAG,augusto.name)
        Log.i(TAG,augusto.age.toString())
        augusto.code()
    }

    private fun enumClass() {
        //se indica el tipo de dato que va a ser  DirectionEnum
        //tambien se puede hacer directamente =  DirectionEnum. la que querramos.
        var userDirection :DirectionEnum? = null
        userDirection =DirectionEnum.EAST
        Log.e(TAG,userDirection.name)
        //  nombre del enum
        Log.e(TAG,userDirection.ordinal.toString())
        //posicion del enum
    }

}