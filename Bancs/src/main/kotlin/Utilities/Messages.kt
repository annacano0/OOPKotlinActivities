package Utilities


/**
 *This function prints welcome message at the start of every iteration of program with blue bold color
 * @author Thalia2603
 * @since 04/01/2024
 */
fun startOfProgramMessage(){
    println(BLUE_BOLD_BRIGHT+"------------------")
    println("     BENVINGUT/DA        ")
    println("------------------"+RESET)
}

/**
 *This function prints goodbye message at the end of every iteration of program with blue bold color
 * @author Thalia2603
 * @since 04/01/2024
 */
fun endOfProgramMessage(){
    println(PURPLE_BOLD_BRIGHT+"Good bye!"+RESET)
}

/**
 *This function prints Data Type error message (used in functions that check input) in red
 * @author Thalia2603
 * @since 04/01/2024
 */
fun messageErrorDT(){
    //funcion que es llamada cuando el tipo de dato es incorrecto
    println(RED_BOLD+"Tipus de dada incorrecta, torni a intentar"+RESET)
}
/**
 *This function prints range error message (used in functions that check input) in yellow
 * @author Thalia2603
 * @since 04/01/2024
 */
fun messageErrorRange(){
    //funcion que es llamada cuando el tipo de dato esta fuera del rango establecido
    println(YELLOW_BOLD+"El valor no es una opció/ no està en rang, torni a intentar"+RESET)
}

fun messageExitProgram(){
    println(RED_BOLD+"FINALITZANT PROGRAMA"+RESET)
}