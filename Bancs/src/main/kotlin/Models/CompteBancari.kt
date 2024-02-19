package Models

open class CompteBancari {
    protected var nomCognom:String
    protected var dataObertura:String
    protected var saldo:Double

    constructor(nomCognom:String, dataObertura:String, saldo:Double){
        this.nomCognom=nomCognom
        this.dataObertura=dataObertura
        this.saldo=saldo
    }

    public fun ingressar(quantitat:Double){
        this.saldo+=quantitat
    }

    public fun consultarSaldo():Double{
        return this.saldo
    }

    override fun toString():String{
        return "\nTitular: "+this.nomCognom+" Obertura: "+this.dataObertura+" Saldo"+this.saldo
    }

}