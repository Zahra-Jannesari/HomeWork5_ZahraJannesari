interface Vehicle
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
    var maxSpeed=120
    var maxCapacity=4
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class Bus():PublicTransportationVehicle{
    var maxSpeed=60
    var maxCapacity=50
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}

class Truck():ServiceTransportationVehicle{
    var maxSpeed=50
    var maxCapacity=2
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class Ambulance():ServiceTransportationVehicle{
    var maxSpeed=200
    var maxCapacity=5
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}

class Van():PublicTransportationVehicle{
    var maxSpeed=100
    var maxCapacity=10
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
class SportCar():PublicTransportationVehicle{
    var maxSpeed=120
    var maxCapacity=4
    override fun maxSpeed(): Int { return maxSpeed }
    override fun maxCapacity():Int {return maxCapacity}
}
fun main() {
}