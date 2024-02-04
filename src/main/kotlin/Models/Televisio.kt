package Models

/**This class inherits properties of class Electrodomestic*/
class Televisio: Electrodomestic {
    //Additional property of class
    private var mida:Int=28

    /**
     * Constructor that gets called and introduces data of the object using the super.constructor,
     * and adds also value of mida
     */
    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float, mida:Int) : super(productId, preuBase, color, consum, pes) {
        this.mida=mida
    }

    /* Overrides getPreuFinalValue() to include the price calculation for
    the television's size.
     */
    override public fun getPreuFinalValue():Float{
        var preuFinal=preuBase
        return preuBase+calculatePriceConsum()+calculatePriceWeigth()+calculatePriceMida()
    }
    /**
     * Calculates the price auplement based on the television's size. Each range has
     * its own supplement.
     */
    private fun calculatePriceMida():Float{
        return when{
            this.mida > 51 -> 200f
            this.mida > 42 -> 150f
            this.mida > 32 -> 100f
            this.mida > 29 -> 50f
            else -> 0f
        }
    }
    /**
     * Overrides toString() to include the additional attribute of television.
     */
    public override fun toString():String{
        return "ProductId: ${super.productId}, preu Base: ${super.preuBase}, color: ${super.color} , consum: ${super.consum} , pes: ${super.pes} , mida: ${this.mida}\n"
    }

}