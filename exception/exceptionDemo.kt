package exception

import java.lang.ArithmeticException
import java.lang.NullPointerException

fun main(args: Array<String>) {
    println("Wakeup!!!")
    println("Do excercise")
    try{
        println(2/0)
    }
    catch (e: ArithmeticException){
        println("use another method : because number cannot be divided by zero")
    }
    catch (e:NullPointerException){
        println("Null pointer Exception...")
    }
    finally {
        println("Exit Code --- Closing Statement")
    }
    println("Breakfast")
    println("Study & attend lecture.")
}
