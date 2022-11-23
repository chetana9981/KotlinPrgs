package collections

fun main(){
    var num1= mutableListOf<Int>(1,2,3,4,1,2)
    println(num1)

    var numwithoutduplicate=num1.toSet()
    println(numwithoutduplicate)
}