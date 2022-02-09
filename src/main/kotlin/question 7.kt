import java.lang.Exception
import java.util.*
fun main(){
    while (true) {
        try {
            var reader=Scanner(System.`in`)
            println("Enter a number (decimal or binary). ")
            var userNumber=reader.nextInt()
            if (!isBinary(userNumber)){
                println("$userNumber equals to ${Integer.toBinaryString(userNumber)}")
                break
            }else{

            }
        } catch (e: Exception) {
            println("Enter a number!")
        }
    }
}
fun isBinary(number: Int): Boolean {
    var binaryNumber = number
    while (binaryNumber > 0) {
        if (binaryNumber % 10 > 1) {
            return false
        }
        binaryNumber /= 10
    }
    return true
}
