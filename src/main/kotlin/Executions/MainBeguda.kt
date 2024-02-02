package Executions

import Models.Beguda

fun mainBeguda(){
    //begudes
    var aigua: Beguda = Beguda("Aigua", 1.0f, false, 100.0f)
    var tallat: Beguda = Beguda("Café tallat", 1.35f, false, 25.0f)
    var teVermell: Beguda = Beguda("Té Vermell", 1.50f, false, 25.0f)
    var Cola: Beguda = Beguda("Cola", 1.65f, true, 350.0f)
    print(aigua)
    print(tallat)
    print(teVermell)
    println(Cola)
}