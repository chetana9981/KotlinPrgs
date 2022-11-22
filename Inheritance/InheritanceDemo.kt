package Inheritance

fun main(){
    var child=Child() //both child and parent obj will be created
    child.display()
    child.test()
}
open class Parent{
    /* constructor(){
         println("parent constructor")
     }*/
    fun display(){
        println("parent class display")
    }
}

class Child: Parent(){
    /*init{
        println("child class")
    }*/
    fun test(){
        println("child class test")
    }
}
