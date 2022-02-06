enum class VehicleName{
    Public_bus, Public_subway,
    Service_ambulance, Service_truck,
    Private_Benz,Private_van
}
interface Vehicle{
    val name:VehicleName
}
interface PublicTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name:VehicleName
}
interface ServiceTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name:VehicleName
}
interface PrivateTransportationVehicle:Vehicle {
    fun maxSpeed()
    fun maxCapacity()
    override val name:VehicleName
}
fun main() {
}