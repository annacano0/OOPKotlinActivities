import Controllers.crearCompte
import Controllers.escollirCompte
import Interfaces.ILiquidable
import Models.CompteBancari
import Utilities.messageExitProgram
import Utilities.readIntRange
import Utilities.readStringSiNo
import Utilities.startOfProgramMessage

fun main(){
    var exit:Boolean=false
    var objectlist:MutableList<ILiquidable> = mutableListOf()

    do {
        startOfProgramMessage()
        var compteUsuari:CompteBancari
        var teCompte= readStringSiNo("Te un compte amb nosaltres?")
        if (teCompte) compteUsuari = escollirCompte(objectList)
        else compteUsuari = crearCompte()
        var userOption= readIntRange("Seleccioni una opcio del menu:\n1.\n2.\n3\n4.\n5.Sortir",1, 5)

        when (userOption){
            1->{}
            2->{}
            3->{}
            4->{}
            5->exit=true
        }

    }while (!exit)
    messageExitProgram()
}