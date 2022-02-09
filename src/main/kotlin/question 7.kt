import java.lang.Exception
import java.util.*
import kotlin.math.pow

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
                var taskDone=false
                while (!taskDone) {
                    println("Is it binary? y/n")
                    var answer = readLine().toString()
                    if (answer.lowercase() == "y") {
                        println("$userNumber equals to ${makeDecimalNumber(userNumber)}")
                        taskDone=true
                    } else if (answer.lowercase() == "n") {
                        println("$userNumber equals to ${Integer.toBinaryString(userNumber)}")
                        taskDone=true
                    }
                }
                break
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
fun makeDecimalNumber(binaryNum: Int): Int {
    var binaryNumber = binaryNum
    var decimalNo = 0
    var power = 0
    while (binaryNumber > 0) {
        val r = binaryNumber % 10L
        decimalNo = (decimalNo + r * 2.0.pow(power.toDouble())).toInt()
        binaryNumber /= 10
        power++
    }
    return decimalNo
}
//fun makeBinaryNumber(decimalNum:Int):Int {
//    var decimalNumber=decimalNum
//    var binaryNumber = 0
//    var count = 0
//    while (decimalNumber != 0) {
//        val rem = decimalNumber % 2
//        val c = 10.toDouble().pow(count)
//        binaryNumber += (rem * c).toInt()
//
//        decimalNumber /= 2
//        count++
//    }
//    return binaryNumber
//}