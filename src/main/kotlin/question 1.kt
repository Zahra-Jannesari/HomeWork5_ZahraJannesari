interface Vehicle{
    var maxSpeed:Int
    var maxCapacity:Int
    override fun toString(): String
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed():Int
    fun maxCapacity():Int
}
interface ServiceTransportationVehicle:Vehicle {
    fun maxSpeed():Int
    fun maxCapacity():Int
}
interface PrivateTransportationVehicle:Vehicle {
    fun maxSpeed():Int
    fun maxCapacity():Int
}

class Taxi():PublicTransportationVehicle{
    override var maxSpeed=120
    override var maxCapacity=4
    override fun toString(): String {
        return "taxi: max speed=$maxSpeed, max capacity=$maxCapacity "
    }

    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class Bus():PublicTransportationVehicle{
    override var maxSpeed=60
    override var maxCapacity=50
    override fun toString(): String {
        return "bus: max speed=$maxSpeed, max capacity=$maxCapacity "
    }
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}

class Truck():ServiceTransportationVehicle{
    override var maxSpeed=50
    override var maxCapacity=2
    override fun toString(): String {
        return "truck: max speed=$maxSpeed, max capacity=$maxCapacity "
    }
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class Ambulance():ServiceTransportationVehicle{
    override var maxSpeed=200
    override var maxCapacity=5
    override fun toString(): String {
        return "ambulance: max speed=$maxSpeed, max capacity=$maxCapacity "
    }
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}

class Van():PrivateTransportationVehicle{
    override var maxSpeed=100
    override var maxCapacity=10
    override fun toString(): String {
        return "van: max speed=$maxSpeed, max capacity=$maxCapacity "
    }
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class SportCar():PrivateTransportationVehicle{
    override var maxSpeed=120
    override var maxCapacity=4
    override fun toString(): String {
        return "sport car: max speed=$maxSpeed, max capacity=$maxCapacity "
    }
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}

fun main() {
    var listOfVehicle=ArrayList<Vehicle>()
    for(i in 1..10){
        var newObject=when((1..6).random()){
            1->Bus()
            2->Taxi()
            3->Truck()
            4->Ambulance()
            5->Van()
            else->SportCar()
        }
        listOfVehicle.add(newObject)
    }
    println("-----------------sort by max speed---------------------")
    listOfVehicle.sortBy {it.maxSpeed}
    listOfVehicle.forEach { println(it.toString()) }
    println("-----------------sort by max capacity---------------------")
    listOfVehicle.sortBy {it.maxCapacity}
    listOfVehicle.forEach { println(it.toString()) }
}