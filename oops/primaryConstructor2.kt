package oops

fun main(args: Array<String>) {
    var employee= EmployeeDe(2)
    employee.displayEmpInfo()

    var employee2= EmployeeDe(4, dept = "Cs")
    employee2.displayEmpInfo()
}
//PRIMARY CONSTRUCTOR
class EmployeeDe(id:Int=1,name:String="Chetana",dept:String="Hr"){
    var id:Int=0
    var name:String=""
    var dept:String=""

    fun displayEmpInfo(){
        println("$id $name $dept" )
    }
}