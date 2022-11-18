fun main() {
    var age = 1

    //if else stmt with body
    if (age>18) {
        println("eligible for vote")
    }
    else
        println("not eligible for vote")

    //if stmt without body so it will take only 1st stmt
    if (age>18)
        println("eligible for vote")
        println("Thanks")

    //if stmt with body will print all the print stmts
    if (age>18)
    {
        println("eligible for vote")
        println("Thanks")
    }
    println("end")
}