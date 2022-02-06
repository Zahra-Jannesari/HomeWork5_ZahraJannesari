fun main(){
    var  check=CheckVariables(2L,8F)
    println(check.compare())
}

class CheckVariables<T>(private var firstVariable:T,private var secondVariable:T){
    fun compare():Any?{
        return if (firstVariable!!::class==secondVariable!!::class){
            when(firstVariable){
                is Byte-> maxOf(firstVariable as Byte,secondVariable as Byte)
                is Short-> maxOf(firstVariable as Short,secondVariable as Short)
                is Int-> maxOf(firstVariable as Int,secondVariable as Int)
                is Long-> maxOf(firstVariable as Long,secondVariable as Long)
                is Float-> maxOf(firstVariable as Float,secondVariable as Float)
                is Double-> maxOf(firstVariable as Double,secondVariable as Double)
                else-> null
            }
        }else{
            println("Variables do not have same types.")
            null
        }
    }
}