package Activitat15

import java.time.LocalDate
import java.util.Date

abstract class CompteBancari {
    protected var dataObertura:LocalDate
    protected var nomCompte:String
    protected var saldo:Float

    constructor(nomCompte:String, saldo:Float){
        this.dataObertura=LocalDate.now()
        this.nomCompte=nomCompte
        this.saldo=saldo
    }

    abstract fun ingresar(quantIngressar:Float)
    abstract fun consultarSaldo():Float

    override fun toString():String{
        return "Obertura: ${this.dataObertura}\nCompte: ${this.nomCompte}\nSaldo: ${this.saldo}\n "
    }
}