package collections

fun main() {

    var fruits: MutableList<String> = mutableListOf("mango","banana","apple","orange")
    println(fruits)

    println()

    fruits.add("papaya")
    fruits.add("guava")

    println(fruits)
}