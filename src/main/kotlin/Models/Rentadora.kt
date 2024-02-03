package Models

class Rentadora:Electrodomestic {
    private var carrega:Int=5
    constructor(productId:String ,preuBase:Float, color:String, consum:Char, pes:Float, carrega:Int) : super(productId ,preuBase, color, consum, pes) {
            this.carrega=carrega
    }

    override public fun getPreuFinal():Float{
        var preuFinal=0f
        return super.preuBase+calculatePriceConsum()+calculatePriceWeigth()+calculatePriceCarrega()
    }
    private fun calculatePriceCarrega():Float{
        var arrayKG= arrayOf(6, 7, 8, 9, 10)
        var arrayEnergyPrice= floatArrayOf(55.0f,55.0f,70.0f,85.0f,100.0f)

        return arrayEnergyPrice[arrayKG.indexOf(this.carrega)]
    }

        public override fun toString():String{
            return "ProductId: ${super.productId}, preu Base: ${super.preuBase}, color: ${super.color} , consum: ${super.consum} , pes: ${super.pes} , carrega: ${this.carrega}\n"
        }


}