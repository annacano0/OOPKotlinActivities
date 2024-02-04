package Models

class Televisio: Electrodomestic {
    private var mida:Int=28

    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float, mida:Int) : super(productId, preuBase, color, consum, pes) {
        this.mida=mida
    }
    override public fun getPreuFinalValue():Float{
        var preuFinal=preuBase
        return preuBase+calculatePriceConsum()+calculatePriceWeigth()+calculatePriceMida()
    }

    private fun calculatePriceMida():Float{
        return when{
            this.mida > 51 -> 200f
            this.mida > 42 -> 150f
            this.mida > 32 -> 100f
            this.mida > 29 -> 50f
            else -> 0f
        }
    }
    public override fun toString():String{
        return "ProductId: ${super.productId}, preu Base: ${super.preuBase}, color: ${super.color} , consum: ${super.consum} , pes: ${super.pes} , mida: ${this.mida}\n"
    }

}