package Models

import Interfaces.ILiquidable

class CompteEstalvi:CompteBancari, ILiquidable {
    private var interes:Double
    override var dataLiquidacio:String=""

    constructor(nomCognom:String, dataObertura:String, saldo:Double, interes:Double):super(nomCognom, dataObertura, saldo){
        this.interes=interes
    }

    override fun  liquidar():Double{
        return this.saldo
    }
}