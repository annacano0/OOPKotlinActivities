package Activitat15

import java.util.*
import Activitat15.*

class CompteCorrent:CompteBancari, Liquidable {
    private var comissionManteniment:Float
    override var messageliquidacio:String="Liquidació efectuada \nNo torni a comptar amb aquests serveis >:("


    constructor(nomCompte:String, saldo:Float, comissionManteniment:Float):super(nomCompte, saldo){
        this.comissionManteniment=comissionManteniment
    }

    override fun getMessageLiquidacio(): String {
        return this.messageliquidacio
    }
    public fun retirar(quantRetirar:Float){
        super.saldo-=quantRetirar
    }

    public fun cobrarComissio(quantComissio:Float){
        super.saldo-=quantComissio
    }

    override fun consultarSaldo(): Float {
        return super.saldo
    }

    override fun ingresar(quantIngressar:Float){
        super.saldo+=quantIngressar
    }

    override fun toString():String{
        return super.toString()+"Comissió manteniment: ${this.comissionManteniment}\n "
    }
}