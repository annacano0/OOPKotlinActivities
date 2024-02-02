package Executions
import Models.Lamp
import Utilities.readInt

fun mainLamp() {
    var lamp1: Lamp =Lamp("menjador")
    lamp1.setLampOn()
    println(lamp1)
    lamp1.changeColor()
    println(lamp1)
    lamp1.changeColor()
    println(lamp1)
    lamp1.changeColor()
    println(lamp1)
    lamp1.setIntensity(readInt("Introdueix la intensitat desitjada", 1, 5))
    println(lamp1)

    var lamp2: Lamp =Lamp("habitacio_petita")
    lamp2.setLampOn()
    println(lamp2)
    lamp2.changeColor()
    println(lamp2)
    lamp2.changeColor()
    println(lamp2)
    lamp2.setIntensity(readInt("Introdueix la intensitat desitjada", 1, 5))
    println(lamp2)
    lamp2.setLampOff()
    println(lamp2)
    lamp2.changeColor()
    println(lamp2)
    lamp2.changeColor()
    println(lamp2)
    lamp2.setLampOn()
    println(lamp2)
    lamp2.setIntensity(readInt("Introdueix la intensitat desitjada", 1, 5))
    println(lamp2)
}