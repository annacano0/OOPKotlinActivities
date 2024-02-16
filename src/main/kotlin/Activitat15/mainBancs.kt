package Activitat15

import Utilities.*

fun main(){
    var bancoPrueba=CompteCorrent(100000, 0f, 12f)
    println(bancoPrueba)
    var exit=false
    var bankAccounts:MutableList<CompteBancari> = mutableListOf <CompteBancari>

    do {
        val hasAccount= readStringSiNo("Te un compte existent?")
        var userOption:Int
        if (hasAccount){
            userOption= readInt("1.Ingressar,\n2.Consultar saldo\n3.Retirar diners de compte corrent\n4.Liquidar compte\n5.Sortir", 1, 5)+2
        } else userOption= readInt("1.Ingressar,\n2.Consultar saldo", 1, 2)
        var userAccount=selectAcount(bankAccounts)
        when (userOption){
           1 -> crearComteCorrent(bankAccounts)
           2 -> crearCompteEstalvi(bankAccounts)
           3 -> ingressarACompte(userAccount)
            4 -> consultarSaldo(userAccount)
            5 -> RetirarDiners(userAccount)
            6 -> LiquidarCompte(userAccount)
            7 ->exit=true
            else -> println("ERROR")
       }
    }while(!exit)
}