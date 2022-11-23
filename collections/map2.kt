package collections

fun main(){
    var products= mutableMapOf<String, Int>("Laptop" to 2000, "Smartwatch" to 1000, "Cloth" to 1500)
    println(products)

    for(keyValue in products.entries)
        println("$keyValue, ${keyValue.value}, ${keyValue.key}")
}