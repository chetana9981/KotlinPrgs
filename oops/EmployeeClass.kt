package oops

fun main(args: Array<String>) {
    var emp:Employee = Employee(798,"Chetana",6000,29)
    emp.displayInfo()
    var perday=emp.calculatePerDaySalary()
    println(" Per Day Salary is : $perday")
    var total=emp.totalsalaryearned()
    println("$total")

}
class Employee{
    //Variables
    var  id:Int=0
    var name:String=""
    var salary:Int=0
    var noOfDaysPresent:Int=0

    //Constructor
    constructor(id:Int,name:String,salary:Int,noOfDaysPresent:Int){
        this.id=id
        this.name=name
        this.salary=salary
        this.noOfDaysPresent=noOfDaysPresent
    }

    //Function
    fun calculatePerDaySalary():Int{
        return  salary/30
    }
    fun totalsalaryearned():String{
        var sal= calculatePerDaySalary()*noOfDaysPresent
        return "Total Salary is :$sal"
    }
    fun displayInfo(){
        println("$id $name $salary $noOfDaysPresent")
    }
}

