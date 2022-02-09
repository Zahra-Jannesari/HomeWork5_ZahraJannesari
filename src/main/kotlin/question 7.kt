import java.lang.Exception
import java.util.*
fun main(){
    while (true) {
        try {
            var reader=Scanner(System.`in`)
            println("Enter a number (decimal or binary). ")
            var userNumber=reader.nextInt()
        } catch (e: Exception) {
            println("Enter a number!")
        }
    }
}
