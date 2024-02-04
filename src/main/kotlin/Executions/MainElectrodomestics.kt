package Executions

import Models.Electrodomestic
import Models.Rentadora
import Models.Televisio
//creates array of Electrodomestic of length 10
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
//prints element by element
    for (element in arrayElectrodomestics){
        println(element)
    }
//gets base price and total price of all Electrodomestics and prints data
    var preuBaseAllElectrodomestics=calculateAllElectrodomesticsBaseP(arrayElectrodomestics)
    var preuTotalAllElectrodomestics=calculateAllElectrodomesticsTotal(arrayElectrodomestics)
    println("-Electrodomestics:\n-Preu Base: "+preuBaseAllElectrodomestics+"\n-Preu Total: "+preuTotalAllElectrodomestics+"\n")
//gets base price and total price of all Rentadores and prints data
    var preuBaseRentadores=calculatePreuBaseRentadores(arrayElectrodomestics)
    var preuTotalRentadores=calculatePreuTotalRentadores(arrayElectrodomestics)

//gets base price and total price of all Televisiors and prints data
    var preuBaseTelevisors = calculatePreuBaseTelevisors(arrayElectrodomestics)
    var preuTotalTelevisors = calculatePreuTotalTelevisors(arrayElectrodomestics)
    println("-Rentadores:\n-Preu Base: "+preuBaseRentadores+"\n-Preu Total: "+preuTotalRentadores+"\n")
    println("-Televisors:\n-Preu Base: "+preuBaseTelevisors+"\n-Preu Total: "+preuTotalTelevisors+"\n")

}
/**
 * Calculates the total base price of all electrodomestic objects in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total base price of all electrodomestics
 */
fun calculateAllElectrodomesticsBaseP(array:Array<Electrodomestic>):Float{
    var total=0f
    for (element in array){
        total+=element.getPreuBaseValue()
    }
    return total
}
/**
 * Calculates the total price of all electrodomestic objects, including additional costs, in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total price of all electrodomestics
 */
fun calculateAllElectrodomesticsTotal(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        total += element.getPreuFinalValue()
    }
    return total
}
/**
 * Calculates the total base price of washing machines in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total base price of washing machines
 */
fun calculatePreuBaseRentadores(array:Array<Electrodomestic>):Float{
    var total=0f
    for (element in array){
        // Check if the element is an instance of Rentadora and add its base price to the total
        if (element is Rentadora) total += element.getPreuBaseValue()
    }
    return total
}
/**
 * Calculates the total price of washing machines, including additional costs, in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total price of washing machines
 */
fun calculatePreuTotalRentadores(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        // Check if the element is an instance of Rentadora and add its final price to the total
        if (element is Rentadora) total += element.getPreuFinalValue()
    }
    return total
}
/**
 * Calculates the total base price of televisions in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total base price of televisions
 */
fun calculatePreuBaseTelevisors(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        // Check if the element is an instance of Televisio and add its base price to the total
        if (element is Televisio) total += element.getPreuBaseValue()
    }
    return total
}
/**
 * Calculates the total price of televisions, including additional costs, in the given array.
 * @param array Array of Electrodomestic objects
 * @return Total price of televisions
 */
fun calculatePreuTotalTelevisors(array: Array<Electrodomestic>): Float {
    var total = 0f
    for (element in array) {
        // Check if the element is an instance of Televisio and add its final price to the total
        if (element is Televisio) total += element.getPreuFinalValue()
    }
    return total
}
