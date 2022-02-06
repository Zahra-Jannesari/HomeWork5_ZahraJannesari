abstract class Employee{
 abstract var name: String
 abstract var age: Int
 abstract val hourRate: Double
 abstract fun salary(hours: Double): Double
 override fun toString(): String {
  return "name: $name age: $age hourRate: $hourRate"
 }
}
class Manager:Employee(){
 override var name: String
  get() = TODO("Not yet implemented")
  set(value) {}
 override var age: Int
  get() = TODO("Not yet implemented")
  set(value) {}
 override val hourRate: Double
  get() = TODO("Not yet implemented")

 override fun salary(hours: Double): Double {
  TODO("Not yet implemented")
 }

}
class  Clerk:Employee(){
 override var name: String
  get() = TODO("Not yet implemented")
  set(value) {}
 override var age: Int
  get() = TODO("Not yet implemented")
  set(value) {}
 override val hourRate: Double
  get() = TODO("Not yet implemented")

 override fun salary(hours: Double): Double {
  TODO("Not yet implemented")
 }

}
data class Customer(var name:String, var age:Int,var gender:Gender){

}
enum class Gender{
 Male,Female
}
fun main(){

 }