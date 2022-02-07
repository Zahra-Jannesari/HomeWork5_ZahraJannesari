fun ArrayList<Any?>.print(){
    this.forEach { item -> println(item.toString()) }
}
class Person
fun main(){
    var testArray=ArrayList<Any?>()
    testArray.add("apple")
    testArray.add(5)
    testArray.add(true)
    var p=Person()
    testArray.add(p)
    testArray.print()
}