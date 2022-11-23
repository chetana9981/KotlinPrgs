package collections

fun main(){
    var num1= mutableListOf<Int>(1,2,3,4,5)
    var num2= mutableListOf<Int>(3,4,5,6,7)

    println("num1 $num1")
    println("num2 $num2")

    /* num1.add(10)
     num1.addAll(num2)

     println("After adding")
     println(num1)

     num1.removeAll(num2)
     println("after removing $num1")*/

    num1.retainAll(num2)
    println("after retaining $num1")

    num1.sort()
    println("after sorting")
    println(num1)
}