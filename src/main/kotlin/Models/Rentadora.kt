package Models
/**
 * This class represents a washing machine inheriting properties from the Electrodomestic class.
 */
class Rentadora:Electrodomestic {
    private var carrega:Int=5
    /**
     * Constructor that initializes the washing machine with provided values, using the
     * super. constructor
     */
    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float, carrega:Int) : super(productId ,preuBase, color, consum, pes) {
            this.carrega=carrega
    }
    /**
     * Overrides getPreuFinalValue() to include the price calculation for the washing machine's load capacity.
     */
    override public fun getPreuFinalValue():Float{
        var preuFinal=0f
        return super.preuBase+calculatePriceConsum()+calculatePriceWeigth()+calculatePriceCarrega()
    }
    /**
     * Calculates the price supplement based on the washing machine's load capacity.
     */
    private fun calculatePriceCarrega():Float{
        var arrayKG= arrayOf(6, 7, 8, 9, 10)
        var arrayEnergyPrice= floatArrayOf(55.0f,55.0f,70.0f,85.0f,100.0f)

        return arrayEnergyPrice[arrayKG.indexOf(this.carrega)]
    }
    /**
     * Overrides toString() to include the additional attribute of the washing machine.
     */
        public override fun toString():String{
            return "ProductId: ${super.productId}, preu Base: ${super.preuBase}, color: ${super.color} , consum: ${super.consum} , pes: ${super.pes} , carrega: ${this.carrega}\n"
        }


}