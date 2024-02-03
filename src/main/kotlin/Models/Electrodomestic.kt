package Models

open class Electrodomestic {
    protected var preuBase:Float=0f
    protected var color:String=""
    protected var consum:Char='D'
    protected var pes:Float=0f
    protected var preuFinal:Float=calculatePreuFinal()

    constructor(preuBase:Float, color:String, consum:Char, pes:Float){
        this.preuBase=preuBase
        this.color=color
        this.consum=consum
        this.pes=pes
    }
    private fun calculatePreuFinal():Float{
        return 0f
    }
    public fun setPreuBase(preuBase:Float){
        this.preuBase=preuBase
    }

    public fun getPreuFinal():Float{
        return this.preuFinal
    }
    override fun toString():String{
        return "Esto devuelve algo"
    }
}