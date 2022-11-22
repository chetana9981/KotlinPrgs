package oops

fun main(args: Array<String>) {
    var car= Car(modelNo = "2022", brand = "BMW", color = "White", kilometerDriven = 50000)
    car.displayCarInfo()
    println(car.checkCarStatus())
}
class Car{

    //variables
    var modelNo:String =""
    var brand:String=""
    var color:String =""
    var kilometerDriven:Int=0

    //initialize the variables : SECONDARY CONSTRUCTOR
    constructor(modelNo:String,brand:String,color:String,kilometerDriven: Int){
        this.modelNo =modelNo
        this.brand=brand
        this.color= color
        this.kilometerDriven=kilometerDriven
    }

    //Function or Methods
    fun checkCarStatus():String{

        if(kilometerDriven<=5000)
            return "Car is in new condition...."
        else if(kilometerDriven>5000 && kilometerDriven<=20000)
            return "car is in good condition......"
        else
            return "car is old......"
    }
    fun displayCarInfo(){
        println("DIsplay Car info!!!!!")
        println("$modelNo  $brand  $color $kilometerDriven")
    }

}

