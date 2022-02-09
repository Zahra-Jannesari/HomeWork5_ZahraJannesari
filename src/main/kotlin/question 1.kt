interface Vehicle{
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
}
interface ServiceTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
}
interface PrivateTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
}
fun main() {
}