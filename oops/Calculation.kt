package oops

import java.util.Scanner
fun main(args: Array<String>) {
    var sc= Scanner(System.`in`)
    print("Enter the value of num1 : ")
    var num1 = sc.nextInt()
    print("Enter the value of num2 : ")
    var num2 = sc.nextInt()


    println("Select from following :\t 1.Addition \t 2.Subtraction \t 3.Multiplication \t 4.Division")
    print("Enter the choice :")
    var choice=sc.nextInt()
    var cal = Calculation(num1,num2)

    when(choice){
        1-> println(cal.add())
        2-> println(cal.sub())
        3-> println(cal.mul())
        4-> println( cal.div())
        else->println("Choose correct choice")
    }
}
class Calculation( num1:Int,  num2:Int){
    var num1:Int = num1
    var num2:Int = num2
    fun add():String{
        return "addition of two numbers is : ${num1+num2}"
    }

    fun sub():String{
        return "Subtraction of two numbers is : ${num1-num2}"
    }
    fun mul():String{
        return "multiplication of two numbers is : ${num1*num2}"
    }
    fun div():String{
        return "Division of two numbers is : ${num1/num2}"
    }
}


