/*
//1
import java.util.Scanner

fun main(args: Array<String>) {
    //creating scanner object
    var sc = Scanner(System.`in`)

    //user input size
    print("Enter the length of string : ")
    var size = sc.nextInt()

    //user defined array
    var number = Array(size,{0})
    for (i in 0..size-1){
        print("Enter the value of $i :")
        number.set(i,sc.nextInt())
    }

    //sorting in ascending order
    number.sort()
    println("Array after sorting: ")

    //print sorted array
    for (i in number)
        print("$i ")
}
*/

//2
import java.util.Scanner
fun main(args: Array<String>) {
    //creating scanner object
    var sc = Scanner(System.`in`)

    //user input size
    print("Enter the size of Array: ")
    var size = sc.nextInt()

    //user defined array
    var marks = Array(size,{0})
    for (i in 0..size-1){
        print("Enter the value of $i : ")
        marks.set(i,sc.nextInt())
    }

    //sorting in descending order
    marks.sortDescending()

    //print sorted array
    for (i in marks){
        print("$i ")

    }
}

/*
//3
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    print("Enter the size of Array: ")
    var size = sc.nextInt()

    var num = Array(size,{0})
    var largest = num[0]

    for (i in 0.. size-1){
        print("Enter the value of $i : ")
        num.set(i,sc.nextInt())
    }
    //1st Method
    for (i in num){
        if(largest < i )
            largest = i
    }
    println("Largest number in array is $largest")

    //2nd Method
    num.sort()
    println("Smallest number in array is ${num.first()}")
    println("Largest number in array is ${num.last()}")

}

//4
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    print("Enter the size of array : ")
    var size = sc.nextInt()

    var num = Array(size,{0})
    for (i in 0.. size-1){
        print("Enter the value for $i : ")
        num.set(i,sc.nextInt())
    }
    num.sort()
    println("Smallest value in the array is : ${num.first()}")
}

//5
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    print("Enter the size of array: ")
    var size = sc.nextInt()

    var num = Array(size,{0})
    for(i in 0..size-1){
        print("Enter the value of $i : ")
        num.set(i,sc.nextInt())
    }

    num.sort()

    var SecondLargest =0
    for (i in 0..size-2){
        if (num[i] != num[size-1]){
            SecondLargest = num[i]
        }
    }
    println("Second largest element in the array is : $SecondLargest")
}

//6
import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    print("Enter the size of array: ")
    var size = sc.nextInt()
    var sum = 0
    var arr = Array(size,{0})
    for (i in 0.. size-1){
        print("Enter the value of $i : ")
        arr.set(i,sc.nextInt())
    }
    for (i in 0..size-1){
        sum = sum + arr[i]
    }
    println("Sum of the array is : $sum")
}

 */