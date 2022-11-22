package oops


fun main(args: Array<String>) {
    var stuent=Student("Chetana","Hr")
    stuent.displayStudentInfo()
}
class Student(name:String,dept:String){
    var name:String=name
    var dept:String=dept
    var studInfo:String=""

    init{
        println("Init Block Called............")
        studInfo= name + dept
    }

    fun displayStudentInfo(){
        println("Name $name")
        println("Department = $dept")
        println("Student Info = $studInfo")
    }
}
