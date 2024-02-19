package Controllers

import Models.CompteBancari
import Models.CompteCorrent
import Models.CompteEstalvi
import Utilities.readIntRange
import Utilities.readSentence

fun crearCompte():CompteBancari{
    var compteNou:CompteBancari
    var tipusDeCompte= readIntRange("Quin tipus de compte vol obrir:\n1.Compte Corrent\n2. Compte estalvi", 1, 2)
    var dataObertura:String= readSentence("Indiqui la data actual")
    var titular:String= readSentence("Indiqui el nom del titular del nou compte")
    var saldo=0.0
    var comissioManteniment=20.0
    var interes=4.0

    if (tipusDeCompte==1) compteNou=CompteCorrent(titular, dataObertura, saldo, comissioManteniment)
    else compteNou=CompteEstalvi(titular, dataObertura, saldo, comissioManteniment)

    return compteNou
}

fun llistarComptes(llistaComptes:MutableList<CompteBancari>){
    for (element in llistaComptes){
        if (element !is CompteCorrent) println(element)
    }
}

fun escollirCompte(llistaComptes:MutableList<CompteBancari>):CompteBancari{
    var valorCorrecte=false
    do {
        var compteUsuari= readSentence("introdueixi el nom del titular del compte")
        for (compte in llistaComptes){
            if (compte.nomCognom==compteUsuari) return compte
        }
    }while (valorCorrecte)
}

fun retirar(llistaComptes: MutableList<CompteBancari>){
    var compte= escollirCompte(llistaComptes)
    var quantitatRetirar=readDouble()
    if (compte is CompteCorrent) compte.retirar()
}