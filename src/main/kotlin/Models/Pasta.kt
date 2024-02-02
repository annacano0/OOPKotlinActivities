package Models

import kotlin.math.round

class Pasta {
    private var nom:String=""
    private var preu:Float=0f
    private var pes:Float=0f
    private var calories:Float=0f
    private var preuK:Float=calcPreuK()

    constructor(){
        this.nom="Pasta per defecte"
    }

    constructor(nom:String, preu:Float, pes:Float, calories:Float){
        this.nom=nom
        this.preu=preu
        this.pes=pes
        this.calories=calories
    }

    private fun calcPreuK():Float{
        return round((this.pes*1000f)/this.preu)
    }
    public fun getPreuK():String{
        return "Nom pasta: "+this.nom+" "+this.preuK+" €/k"
    }
    public fun setPreu(preu:Float){
        this.preu=preu
    }
    override fun toString():String{
        return this.nom+" "+this.preu+" € "+this.pes+" g "+this.calories+" calories\n"
    }
}