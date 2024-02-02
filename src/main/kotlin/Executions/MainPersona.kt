package Executions
import Models.Persona

fun mainPersona() {
    var persona1=Persona()
    var persona2=Persona("Manolito","Lopez Lopez")
    val persona3=Persona("89898989Z", "Pepito","Ramirez Ramirez", 18, false)
    println(persona1)
    println(persona2)
    println(persona3)

    persona3.aniversari()
    persona3.casament()
    println(persona3)

    persona3.divorci()
    println(persona3)
}