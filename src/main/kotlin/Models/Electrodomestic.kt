package Models

open class Electrodomestic {
    protected var productId: String=""
    protected var preuBase: Float=0f
    protected var color: String = "blanc"
    protected var consum: Char = ' '
    protected var pes: Float = 0f

    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float){
        this.productId=productId
        this.preuBase=preuBase
        this.color=color
        this.consum=consum
        this.pes=pes
    }

    protected fun calculatePriceConsum():Float{
        var arrayEnergyLetter:Array<Char> =arrayOf('A','B','C','D','E','F','G')
        var arrayEnergyPrice= floatArrayOf(35.0f,30.0f,25.0f,20.0f,15.0f,10.0f,0.0f)

        return arrayEnergyPrice[arrayEnergyLetter.indexOf(this.consum)]
    }

    protected fun calculatePriceWeigth():Float{
        return when {
            this.pes > 80f -> 100f
            this.pes > 50f -> 80f
            this.pes > 20f -> 50f
            this.pes > 6f -> 20f
            else -> 0f
        }
    }
    public fun setColor(color:String){
        var colorOptions=arrayOf("blanc", "platejat", "color")
        if(colorOptions.indexOf(color.lowercase())!=-1) this.color=color
    }
    public fun setPreuBase(preuBase:Float){
        this.preuBase=preuBase
    }
    public fun getPreuBase(): Float {
        return this.preuBase
    }
    public open fun getPreuFinal():Float{
        var preuFinal=0f
        return this.preuBase+calculatePriceConsum()+calculatePriceWeigth()
    }

    override fun toString():String{
        return "ProductId: ${this.productId}, preu Base: ${this.preuBase}, color: ${this.color} , consum: ${this.consum} , pes: ${this.pes}\n"
    }
}