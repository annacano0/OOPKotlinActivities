package Activitat15
import Activitat15.*


class CompteEstalvi:CompteBancari,Liquidable {
    private var interes:Float
    override var messageliquidacio:String="Liquidació efectuada \nMoltes gràcies per haber confiat en nosaltres"

    constructor(nomCompte:String, saldo:Float, interes:Float):super(nomCompte, saldo){
        this.interes=interes
    }

    public fun setInteres(interes:Float){
        this.interes=interes/100
    }

    override fun getMessageLiquidacio(): String {
        return this.messageliquidacio
    }

    override fun consultarSaldo(): Float {
        return super.saldo
    }

    override fun ingresar(quantIngressar:Float){
        super.saldo+=quantIngressar
    }

    override fun toString():String{
        return super.toString()+"Interes: ${this.interes}\n "
    }

}