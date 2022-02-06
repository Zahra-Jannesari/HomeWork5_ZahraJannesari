abstract class Employee(var name: String,var age: Int, var hourRate: Double){
 abstract fun salary(hours: Double): Double
 override fun toString(): String {
  return "name: $name age: $age hourRate: $hourRate"
 }
}
class Manager(name: String="",age: Int=20,hoursRate: Double=0.0):Employee(name,age,hoursRate){
 override fun salary(hours: Double): Double {
  return hourRate*hours
 }
}
class  Clerk(name: String="",age: Int=20,hoursRate: Double=0.0):Employee(name,age,hoursRate){
 override fun salary(hours: Double): Double {
  return hourRate*hours/2
 }
}
data class Customer(var name:String, var age:Int,var gender:Gender){

}
enum class Gender{
 Male,Female
}
fun main(){

 }