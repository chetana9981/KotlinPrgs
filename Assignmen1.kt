

//leap year or not
fun main(args: Array<String>) {

    val year = 2012
    var leap = false

    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}





//swap with temporary variable
fun main(args: Array<String>) {

    var first = 1.20f
    var second = 2.45f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    // Value of first is assigned to temporary
    val temporary = first

    // Value of second is assigned to first
    first = second

    // Value of temporary (which contains the initial value of first) is assigned to second
    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}





//swap with permanent variable
fun main(args: Array<String>) {

    var first = 12.0f
    var second = 24.5f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first + second
    first = second - first

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}




//factorial
fun main(args: Array<String>) {

    val num = 10
    var factorial: Long = 1
    for (i in 1..num) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}





//fibonacci
fun main(args: Array<String>) {
    val n = 10
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1  ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}




//reverse
fun main(args: Array<String>) {
    var num = 1234
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")
}






//to print between 1 to 20 using for loop
import java.util.Scanner
fun main() {
    var sc=Scanner(System.`in`)
    println("Enter a number:")
    var num=sc.nextInt()
    println("Even numbers from 1 to $num:")
    for(i in 1..num)
    {
        if(i%2==0)
        {
            println("$i")
        }
    }
}




//palindrome
fun main(args: Array<String>) {
    var num = 121
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    // reversed integer is stored in variable
    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")
}




//print the pattern
fun main(args: Array<String>) {
    val rows = 5
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }
}




//amstrong

fun main(args: Array) {
    val number = 1634
    var originalNumber: Int
    var remainder: Int
    var result = 0
    var n = 0

    originalNumber = number

    while (originalNumber != 0) {
        originalNumber /= 10
        ++n
    }

    originalNumber = number

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}




//print number in a pattern
fun main(args: Array<String>) {
    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}
