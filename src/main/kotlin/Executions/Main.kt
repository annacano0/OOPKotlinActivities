package org.example.Executions

import Executions.*
import Utilities.readInt

fun main() {
var exit=false
    var userOption=0
    do {
        userOption= readInt("Activities menu:\n1.Execute Persona\n2.Execute Cercle\n3.Execute Pasta\n4.Execute Beguda\n5.Execute Lamp\n6.Execute Electrodomestics\n7.Exit\n", 1, 7)
        when (userOption){
            1-> mainPersona()
            2-> mainCercle()
            3-> mainPasta()
            4-> mainBeguda()
            5-> mainLamp()
            6-> mainElectrodomestics()
            else-> println("ERROR, TRY AGAIN")
        }
    }while (!exit)
}