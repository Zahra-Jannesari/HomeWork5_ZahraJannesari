abstract class Employee(var name: String, var age: Int, var hourRate: Double) {
    val ListOfPayments=ArrayList<Double>()
    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
 fun getTotalPayment(){

 }
}

class Manager(name: String = "", age: Int = 20, hoursRate: Double = 0.0) : Employee(name, age, hoursRate) {
    override fun salary(hours: Double): Double {
        return hourRate * hours
    }
}

class Clerk(name: String = "", age: Int = 20, hoursRate: Double = 0.0) : Employee(name, age, hoursRate) {
    override fun salary(hours: Double): Double {
        return hourRate * hours / 2
    }
}

data class Customer(var name: String, var age: Int, var gender: Gender) {
}

enum class Gender {
    Male, Female
}

fun main() {
    var managerAli=Manager("Ali", 52, 104.0)
    var clerkSama=Clerk("Sama", 26, 110.0)
    var managerReza=Manager("Reza", 42, 120.0)
    var managerFarhad=Manager("Farhad", 34, 120.0)
    var employeeList= listOf(managerAli,clerkSama,managerReza,managerFarhad)
    var hoursList= listOf(140.0,150.0,130.0,180.0)
    for (i in 0..3){
        println(employeeList[i].salary(hoursList[i]))
    }
}