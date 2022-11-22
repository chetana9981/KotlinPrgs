package exception

import java.util.InputMismatchException
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    try {
        print("Enter first number :")
        var num1 =sc.nextInt()
        print("Enter Second number :")
        var num2 =sc.nextInt()
        var div = num1/num2
        println("Divison of $num1 & $num2 is : $div")
    }
    catch (e:ArithmeticException){
        println("Denominator cannot be 0")
    }
    catch (e:InputMismatchException){
        println("Characters cannot be entered!!!")
    }
}
