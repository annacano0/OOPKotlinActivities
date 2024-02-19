package Models

import Interfaces.ILiquidable

class CarteraValors:ILiquidable {
    private var nomCognom:String
    private var nomEmpresa:String
    private var quantitat:Int
    private var valor:Double
    override var dataLiquidacio:String=""

    constructor(nomCognom:String, nomEmpresa:String, quantitat:Int, valor:Double){
        this.nomCognom=nomCognom
        this.nomEmpresa=nomEmpresa
        this.quantitat=quantitat
        this.valor=valor
    }

    public fun calularValor():Double{
        return valor*quantitat
    }

    public fun counsultarValor(){
        println(calularValor())
    }

    override fun  liquidar():Double{
        return this.calularValor()
    }


    override fun toString():String{
        return "\nTitular: "+this.nomCognom+" Empresa: "+this.nomEmpresa+" Quantitat: "+this.quantitat+" Valor:"+this.valor
    }


}