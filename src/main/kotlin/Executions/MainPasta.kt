package Executions
import Models.Pasta
import Models.Beguda

fun main() {
    //pastes
    println("\nPASTES\n")
    var pasta1:Pasta=Pasta()
    var croisant:Pasta=Pasta("Croisant", 1.25f, 50f, 100f)
    var ensaimada:Pasta=Pasta("Ensaimada", 1.75f, 110f, 250f)
    var donut:Pasta=Pasta("Donut", 0.95f, 65f, 160f)
    donut.setPreu(1f)
    print(donut)
    print(croisant)
    print(ensaimada)
    println("\nBEGUDES\n")
    //begudes
    var aigua:Beguda=Beguda("Aigua", 1.0f, false, 100.0f)
    var tallat:Beguda=Beguda("Café tallat", 1.35f, false, 25.0f)
    var teVermell:Beguda=Beguda("Té Vermell", 1.50f, false, 25.0f)
    var Cola:Beguda=Beguda("Cola", 1.65f, true, 350.0f)
    print(aigua)
    print(tallat)
    print(teVermell)
    println(Cola)
}