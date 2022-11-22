package strings

fun main(args: Array<String>) {

    var str = "Chetana Patil"
    val oldValue = "PATIL"
    val newValue = "P"

    val output = str.replace(oldValue, newValue, ignoreCase = true)
    val output1 = str.replace(oldValue, newValue, ignoreCase = false)

    print(output)
    print(output1)
}