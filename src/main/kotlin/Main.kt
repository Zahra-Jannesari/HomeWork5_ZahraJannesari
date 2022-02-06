
interface Vehicle{
    val name:String
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
}
interface ServiceTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
}
interface PrivateTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name: String
}
fun main() {
}