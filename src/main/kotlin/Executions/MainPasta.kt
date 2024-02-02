package Executions
import Models.Pasta
import Models.Beguda

fun mainPasta() {
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

}