package Models

class Lamp {
    private var lampID:String=""
    private var turnedOn:Boolean=false
    private var color:String="White"
    private var intensity:Int=1

    constructor(id:String){
        this.lampID=id
    }

    public fun setLampOn(){
        this.turnedOn=true
    }

    public fun setLampOff(){
        this.turnedOn=false
    }

    public fun changeColor(){
        val arrayColors=arrayOf("White", "Red", "Blue", "Green", "Pink", "Yellow")
        var posNewColor:Int=arrayColors.indexOf(this.color)
        if(posNewColor==arrayColors.size-1) posNewColor=0
        else posNewColor+=1
        this.color=arrayColors[posNewColor]
    }

    public fun setIntensity(newIntensity:Int){
        this.intensity=newIntensity
    }


    override fun toString():String{
        var OnOffMessage=""
        if (this.turnedOn==true) OnOffMessage="On"
        else OnOffMessage="Off"
        return "Lamp: "+this.lampID+"\nState: "+OnOffMessage+"\nColor: "+this.color+"\nIntensity:"+this.intensity+"\n"
    }
}