package Executions
import Models.Cercle
import Utilities.readFloat
import Utilities.readInt
import Utilities.readWord

fun mainCercle(){
    var exit=false
    var cercle:Cercle=Cercle()
    do {
        var userOption=readInt("Sel·leccioni una opció:\n1.Crear un cercle d'un radi i color determinat" +
                "\n2.Crear un recle d'un color determinat" +
                "\n3.Mostrar l'ultim cercle creat" +
                "\n4.mostrar perimetre de l'ultim cercle creat" +
                "\n5.Mostra l'area de l'ultim cercle creat" +
                "\n6.Sortir\n", 1, 6)

        when (userOption){
            1->{
                var radi=readFloat("Introdueix valor del radi")
                var color= readWord("Introdueix color")
                cercle=Cercle(radi, color)
            }
            2->{
                var radi=readFloat("Introdueix valor del radi")
                cercle=Cercle(radi)
            }
            3->println(cercle.toString())
            4->println(cercle.getPerimetre())
            5->println(cercle.getArea())
            6->{
                exit=true
                println("adeu!")
            }
            else -> println("ERROR")
        }
    }while(!exit)

}