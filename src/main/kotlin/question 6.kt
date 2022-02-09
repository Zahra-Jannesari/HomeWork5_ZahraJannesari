fun main(){
    var n = 5
    println("Your input is: $n")

    for (i in 0 until n)
        println("Your output is $i");


    for (i in 1..n) {
        for(j in 1..n)
            println("Your output is $i and $j")
        }


    fun factorial(n:Int):Int{
        return if (n >= 1)
            n * factorial(n- 1)
        else
            1
    }
    for (i in 1..factorial(n)){
        println("Your output is $i");
    }

}