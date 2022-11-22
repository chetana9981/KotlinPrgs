package oops

fun main(args: Array<String>) {
    var person= Person("Chetana",22)
    person.displayPersonInfo()
}

//Primary Constructor
class Person(name:String,age:Int){
    var name:String=""
    var age:Int=0

    init{
        println("Initialize Block.......")
    }

    fun displayPersonInfo(){
        println("Name= $name , Age = $age")
    }
}
