package collections

fun main(){
    var num1= mutableListOf<Int>(1,2,3,4,5,6)
    println(num1)
    println(num1.size)

    println("--------")
    println(num1.any{it%2==0})
    println(num1.any({it>20}))

    println("--------")
    println(num1.all{it%2==0})
    println(num1.all{it<10})

    println("--------")
    println(num1.count())
    println(num1.count{it>2})

    println("--------")
    println(num1.max())
    println(num1.min())

}