package Activitat15

import Utilities.readInt

fun main(){
    var bancoPrueba=CompteCorrent("09093489", 0f, 12f)
    println(bancoPrueba)
    var exit=false
    var bankAccounts:MutableList<CompteBancari>

    do {
       var userAccount=selectAcount(bankAccounts)
       var userOption= readInt("1.Crear compte corrent\n2.Crear compte estalvi\n3.Ingressar,\n4.Consultar saldo\n5.Retirar diners de compte corrent\n6.Liquidar compte\n7.Sortir", 1, 7)

        when (userOption){
           1 -> crearComteCorrent(userAccount)
           2 -> crearCompteEstalvi(userAccount)
           3 -> ingressarACompte(userAccount)
            4 -> consultarSaldo(userAccount)
            5 -> RetirarDiners(userAccount)
            6 -> LiquidarCompte(userAccount)
            7 ->exit=true
            else println("ERROR")
       }
    }while(!exit)
}