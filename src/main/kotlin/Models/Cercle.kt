package Models

import kotlin.math.PI
import kotlin.math.round

class Cercle {
    private var radi:Float=0f
    private var color:String="null"
    private var perimetre:Float=0f
    private var area:Float=0f

    constructor(){
        this.radi=0f
        this.color="blanc"
        this.perimetre=calcPerimetre(this.radi)
        this.area=calcArea(this.radi)
    }

    constructor(radi:Float){
        this.radi=radi
        this.color="blanc"
        this.perimetre=calcPerimetre(this.radi)
        this.area=calcArea(this.radi)
    }

    constructor(radi:Float, color:String){
        this.radi=radi
        this.color=color
        this.perimetre=calcPerimetre(this.radi)
        this.area=calcArea(this.radi)
    }
    private fun calcPerimetre(radi:Float):Float{
        return round((PI*radi)).toFloat()
    }
    private fun calcArea(radi:Float):Float{
        return round((PI*(radi*radi))).toFloat()
    }
    public fun getPerimetre():Float{
        return this.perimetre
    }

    public fun getArea():Float{
        return this.area
    }

    override fun toString():String{
        return "Info del cercle::\n Radi: ${radi}\n Color: ${color}\n"
    }
}