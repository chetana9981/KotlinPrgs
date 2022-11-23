package collections

class Product(id:Int, name:String, price:Double){
    var id:Int=id
    var name:String=name
    var price:Double=price

}

fun main(){
    var products= mutableListOf<Product>()
    products.add(Product(1, "Laptop", 56000.52))
    products.add(Product(2, "Mobile", 75000.0))
    products.add(Product(3, "Tablet", 25000.56))

    for(product in products)
        println("${product.id} ${product.name} ${product.price}")

}