package Activitat15

import Utilities.readInt

fun selectAcount(comptes:MutableList<CompteBancari>):CompteBancari{
    var accountnotFound=true
    do {
        var nomCompte= readInt("Introdueix el codi de la compta XXXXXX", 100000,999999)
        for (compte in comptes){
            if (nomCompte==compte.getNomCompte()){
                return compte
            }
        }
        println("No s'ha trobat, intenti una altra vegada")
    }while (accountnotFound)
}

fun  crearComteCorrent(bankLists:MutableList<CompteBancari>){
}


fun crearCompteEstalvi(bankLists:MutableList<CompteBancari>){

}

fun ingressarACompte(userAccount:CompteBancari){

}
fun consultarSaldo(userAccount:CompteBancari){

}
fun RetirarDiners(userAccount:CompteBancari){

}
fun LiquidarCompte(userAccount:CompteBancari){

}