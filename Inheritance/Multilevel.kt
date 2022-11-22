package Inheritance

fun main(args: Array<String>)
{
    var obj = Eagle()
    // calling methods from base and child classes
    obj.display()
    obj.talk()
    obj.cannotTalk()
}
open class Bird2(var name:String){
    fun display(){
        println("Birds can fly..... ")
    }
}
open class Parrot:Bird2("Tweety"){
    fun talk(){
        println("Parrot can talk.....")
    }
}
class Eagle:Parrot(){
    fun cannotTalk(){
        println("Eagle cannot talk.....")
    }
}