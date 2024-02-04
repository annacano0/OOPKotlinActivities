package Executions

import Models.Electrodomestic
import Models.Rentadora
import Models.Televisio

fun mainElectrodomestics(){
    val arrayElectrodomestics:Array<Electrodomestic> =arrayOf(
        Electrodomestic("Microones1", 100f, "platejat",'A', 4.90f),
    Electrodomestic("Microones2", 100f, "blanc",'G', 4.50f),
    Electrodomestic("Nevera12", 450f, "blanc",'D', 25.00f),
    Electrodomestic("Forn09", 390f, "color",'A', 43.50f),
    Electrodomestic("AirFrier", 85.5f, "platejat",'F', 2.50f),
    Electrodomestic("Microones1", 123.67f, "color",'E', 5.990f),
    Televisio("SamsungTV23", 478f, "platejat",'A', 12.60f, 30),
    Televisio("Sony4", 100f, "platejat",'A', 2.50f, 55),
    Rentadora("Balay2", 100f, "platejat",'A', 2.50f, 8),
    Rentadora("Renta200", 100f, "platejat",'A', 2.50f, 6)
    )

    for (element in arrayElectrodomestics){
        println(element)
    }

    var preuBaseAllElectrodomestics=calculateAllElectrodomesticsBaseP(arrayElectrodomestics)
    var preuTotalAllElectrodomestics=calculateAllElectrodomesticsTotal(arrayElectrodomestics)
    println("-Electrodomestics:\n-Preu Base: "+preuBaseAllElectrodomestics+"\n-Preu Total: "+preuTotalAllElectrodomestics+"\n")

    var preuBaseRentadores=calculatePreuBaseRentadores(arrayElectrodomestics)
    var preuTotalRentadores=calculatePreuTotalRentadores(arrayElectrodomestics)

    var preuBaseTelevisors = calculatePreuBaseTelevisors(arrayElectrodomestics)
    var preuTotalTelevisors = calculatePreuTotalTelevisors(arrayElectrodomestics)
    println("-Rentadores:\n-Preu Base: "+preuBaseRentadores+"\n-Preu Total: "+preuTotalRentadores+"\n")
    println("-Televisors:\n-Preu Base: "+preuBaseTelevisors+"\n-Preu Total: "+preuTotalTelevisors+"\n")

}

fun calculateAllElectrodomesticsBaseP(array:Array<Electrodomestic>):Float{
    var total=0f
    for (element in array){
        total+=element.getPreuBaseValue()
    }
    return total
}

fun calculateAllElectrodomesticsTotal(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        total += element.getPreuFinalValue()
    }
    return total
}

fun calculatePreuBaseRentadores(array:Array<Electrodomestic>):Float{
    var total=0f
    for (element in array){
        if (element is Rentadora) total += element.getPreuBaseValue()

    }
    return total
}

fun calculatePreuTotalRentadores(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
       if (element is Rentadora) total += element.getPreuFinalValue()
    }
    return total
}

fun calculatePreuBaseTelevisors(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        if (element is Televisio) total += element.getPreuBaseValue()
    }
    return total
}

fun calculatePreuTotalTelevisors(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        if (element is Televisio) total += element.getPreuFinalValue()
    }
    return total
}
