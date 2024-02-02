package Models
class Beguda {
    private var nom:String=""
    private var ml:Float=0f
    private var preu:Float=0f
    private var begudaEnsucrada:Boolean=false
    private var preuLiter=calcPreuLiter()

    constructor(){
        this.nom="Beguda per defecte"
    }

    constructor(nom:String, preu:Float, begudaEnsucrada:Boolean, ml:Float){
        this.nom=nom
        this.preu=preu
        this.begudaEnsucrada=begudaEnsucrada
        this.ml=ml
    }
    private fun calcPreuLiter():Float{
        return (1000f*this.preu)/this.ml
    }

    override fun toString():String{
        return "Beguda: "+this.nom+" "+this.ml+" ml "+this.preu+" "+this.begudaEnsucrada+"\n"
    }

}