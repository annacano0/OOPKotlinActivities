package Models

open class Electrodomestic {
    //atributes of electrodomestic and "default" values
    protected var productId: String=""
    protected var preuBase: Float=0f
    protected var color: String = "blanc"
    protected var consum: Char = ' '
    protected var pes: Float = 0f

    //constructor that gets called and introduces data of object
    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float){
        this.productId=productId
        this.preuBase=preuBase
        this.color=color
        this.consum=consum
        this.pes=pes
    }

    /*function that calculates the price depending on energy usage. Each
    letter has its own  price addition*/
    protected fun calculatePriceConsum():Float{
        var arrayEnergyLetter:Array<Char> =arrayOf('A','B','C','D','E','F','G')
        var arrayEnergyPrice= floatArrayOf(35.0f,30.0f,25.0f,20.0f,15.0f,10.0f,0.0f)

        return arrayEnergyPrice[arrayEnergyLetter.indexOf(this.consum)]
    }

    /*function that calculates the price depending on teh electrodomestic's weigth,
    * depending on weight ranges. Each range has its own price supplement*/
    protected fun calculatePriceWeigth():Float{
        return when {
            this.pes > 80f -> 100f
            this.pes > 50f -> 80f
            this.pes > 20f -> 50f
            this.pes > 6f -> 20f
            else -> 0f
        }
    }

    /*Function that sets new value of color to the object,
    * if the color isn't an option, the color won't change*/
    public fun setColorValue(color:String){
        var colorOptions=arrayOf("blanc", "platejat", "color")
        if(colorOptions.indexOf(color.lowercase())!=-1) this.color=color
    }

    /*Function that sets new value for base price*/
    public fun setPreuBaseValue(preuBase:Float){
        this.preuBase=preuBase
    }

    /*Function that returns value for base price*/
    public fun getPreuBaseValue(): Float {
        return this.preuBase
    }

    /*Function taht calculates the final price using the basePrice and
    * adding the result of calculatePriceConsum() and calculatePriceWeigth() */
    public open fun getPreuFinalValue():Float{
        var preuFinal=0f
        return this.preuBase+calculatePriceConsum()+calculatePriceWeigth()
    }

    /*Function that overrides toString() and returns object's data with short messages.*/
    override fun toString():String{
        return "ProductId: ${this.productId}, preu Base: ${this.preuBase}, color: ${this.color} , consum: ${this.consum} , pes: ${this.pes}\n"
    }
}