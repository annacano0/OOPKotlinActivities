package Models

class Persona{
    private var dni:String=""
    private var nom:String=""
    private var cognoms:String=""
    private var edat:Int=0
    private var estatCivil:Boolean=false

    constructor(){
        dni="00000000A"
        nom="Nombre"
        cognoms="Cognom1 Cognom2"
    }

    constructor(nom:String, cognom:String){
        this.nom=nom
        this.cognoms=nom
    }
    constructor(dni:String, nom:String, cognoms:String, edat:Int, estatCivil:Boolean){
        this.dni=dni
        this.nom=nom
        this.cognoms=cognoms
        this.edat=edat
        this.estatCivil=estatCivil
    }

    public fun aniversari(){
        this.edat+=1
    }

    public fun casament(){
        this.estatCivil=true
    }

    public fun divorci(){
        this.estatCivil=false
    }

    override fun toString():String{
        return "Dades de persona :: " +
                "\n DNI:  ${dni}"+
                "\n Nom: ${nom}" +
                "\n Cognoms:  ${cognoms}"+
                "\n Edat:  ${edat}"+
                "\n Casat:  ${estatCivil}\n"
    }
}