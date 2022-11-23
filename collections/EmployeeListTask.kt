package collections

class Employee(id:Int,name: String, dept: String, salary:Double, age: Int){
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Double=salary
    var age:Int=age
}

fun main(){
    var employees= mutableListOf<Employee>()
    employees.add(Employee(1,"Chetana","HR",30000.50, 22))
    employees.add(Employee(2,"Neha","CS",35000.65,23))
    employees.add(Employee(3,"Komal","TA",45000.65,22))
    employees.add(Employee(4,"Snehal", "HR",85000.56,22))

    for(employee in employees)
        println("${employee.id} ${employee.name} ${employee.dept} ${employee.salary} ${employee.age}")
}