package strings

fun main(args: Array<String>){
    val str1 = "Hello World!"
    val str2 = "Hello World!"
    println(str1==str2)
    println(str1!=str2)
    if (str1==str2)
        println("Strings are equal!!")
    else
        println("Strings are not equal!!")
}