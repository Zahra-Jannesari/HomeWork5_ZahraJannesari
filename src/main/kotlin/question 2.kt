abstract class Employee(var name: String, var age: Int, var hourRate: Double) {
    val listOfPayments=ArrayList<Double>()
    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
    fun getTotalPayment():Double {
        var sumOfPayment=0.0
        listOfPayments.forEach { sumOfPayment+=it }
        return sumOfPayment
    }
}

class Manager(name: String = "", age: Int = 20, hoursRate: Double = 0.0) : Employee(name, age, hoursRate) {
    override fun salary(hours: Double): Double {
        var salary=hourRate * hours
        listOfPayments.add(salary)
        return salary
    }
    override fun toString(): String {
        return "manager:${super.toString()}"
    }
}

class Clerk(name: String = "", age: Int = 20, hoursRate: Double = 0.0) : Employee(name, age, hoursRate) {
    override fun salary(hours: Double): Double {
        var salary=hourRate * hours / 2
        listOfPayments.add(salary)
        return salary
    }
}

data class Customer(var name: String, var age: Int, var gender: Gender)
enum class Gender { Male, Female }

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

    var customer1=Customer("Sara",22,Gender.Female)
    var customer2=Customer("Maryam",30,Gender.Female)
    println("Are customer 1 & 2 equal? ${customer1==customer2}")

    var managers=ArrayList<Manager>()
    employeeList.forEach{if (it is Manager) managers.add(it) }
    println( managers.maxByOrNull { manager -> manager.age })
}