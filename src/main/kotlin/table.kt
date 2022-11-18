import java.util.Scanner

fun main() {

    var scan=Scanner(System.`in`)

    println("-----table generator-----")
    println("enter the table name")
    var tableName=scan.nextInt()

    println("enter the table limit")
    var tableLimit=scan.nextInt()


    for (i in 1..tableLimit)
        println("$tableName * $i = ${tableName*i}")


}
