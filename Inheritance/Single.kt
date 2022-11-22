package Inheritance

open class Bird {
    fun fly() {
        println("Bird is Flying....")
    }
}
class Duck: Bird() {
    fun swim() {
        println("duck is swimming...")
    }
}
fun main(args: Array<String>) {
    val duck = Duck()
    duck.fly()
    duck.swim()
}