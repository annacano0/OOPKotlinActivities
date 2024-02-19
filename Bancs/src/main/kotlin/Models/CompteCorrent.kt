package Models

import Interfaces.ILiquidable

class CompteCorrent:CompteBancari, ILiquidable {
    private var comissioManteniment:Double
    override var dataLiquidacio:String=""

    constructor(nomCognom:String, dataObertura:String, saldo:Double, comissioManteniment:Double):super(nomCognom, dataObertura, saldo){
        this.comissioManteniment=comissioManteniment
    }

    public fun retirar(quantitat:Double){
        this.saldo-=quantitat
    }

    public fun cobrarComissio(){
        this.saldo-=comissioManteniment
    }

    override fun liquidar():Double{
        return this.saldo
    }

    override fun toString():String{
         return super.toString()+" Comissió manteniment" +this.comissioManteniment
    }
}