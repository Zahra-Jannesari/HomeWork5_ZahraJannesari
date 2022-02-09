fun main(){

    var n = 5
    println("Your input is: $n")
    /*
    complexity of this piece of code is O(1):a constant amount of time is needed for code to run.
    the code repeats just one time and prints a very simple sentence:"Your input is: 5"
    */


    for (i in 0 until n)
        println("Your output is $i");
    /*
    complexity of this piece of code is O(n=5)
    time depends on 'n'. A constant amount of time multiply by 5 is needed for code to run.
    the code repeats n=5 time and each time prints a sentence.
    */


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