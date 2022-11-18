fun main() {

    var age= 22

    var result:Any = if(age<10)
        "children"
    else if (age>10 && age<=18)
        "teenage"
    else
        "adult"

    println(result)
}