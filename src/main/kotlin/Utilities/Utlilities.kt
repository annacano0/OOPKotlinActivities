package Utilities

import java.util.*

fun messageWrongDataType(){
    println("El tipus de dada no és correcte")
}

fun messageWrongRange(){
    println("La opcio seleccionada no és una opció")
}


/**This method asks user for Int and validates entry via Scanner,
 * controlling data type error and range error
 * @author annacano0
 * @since 20/01/2024
 * @param pMessageIn Introductori message tha asks user for input
 * @param pMin Minimum value for method
 * @param pMax Maximum value for method
 * @return value of Int
 */
fun readInt(pMessageIn:String, pMin:Int, pMax:Int):Int{
    val scan= Scanner(System.`in`)
    var correctValue=false
    var output:Int=0
    print(pMessageIn)
    do {
        if (scan.hasNextInt()){
            output=scan.nextInt()
            if (output>=pMin||output<=pMax) correctValue=true
            else messageWrongRange()
        }else messageWrongDataType()
    }while (!correctValue)
    return output
}


/**
 * This method can be used to read a Float value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @return outputValue Output value
 */
fun readFloat(pMessageIn: String
): Float{
    val scan= Scanner(System.`in`)
    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()

        if (!correctDataType){
            messageWrongDataType()
        }else{
            outputValue = scan.nextFloat()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}


/**
 * This method can be used to read a String word value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readWord(pMessageIn: String): String{
    val scan= Scanner(System.`in`)
    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            messageWrongDataType()
        }else{
            outputValue = scan.next().lowercase()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Si/No string value from the user through keyboard using java.util.Scanner
 * and returns boolean
 * @author annacano0
 * @since 22/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value (boolean)
 */
fun readStringSiNo(pMessageIn: String): Boolean {
    val scan= Scanner(System.`in`)
    var inputCorrecte: Boolean = true
    var inputUsuari: String = ""
    var outputValue: Boolean = false
    do {
        println(pMessageIn)
        if (scan.hasNextLine()) {
            inputCorrecte = true
            inputUsuari = scan.nextLine().lowercase()
            if (inputUsuari == "si") {
                outputValue = true
            } else if (inputUsuari == "no") {
                outputValue = false
            } else {
                println("Incorrect data type")
                inputCorrecte = false
            }
        } else {
            scan.nextLine()
            println("Value is not an option")
            inputCorrecte = false
        }
    } while (!inputCorrecte)
    return outputValue
}
