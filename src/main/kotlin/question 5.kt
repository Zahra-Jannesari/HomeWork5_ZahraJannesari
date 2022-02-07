fun <T>List<T>.sliceAtGivenIndex(index:Int){
    if(index in 0 until this.size){
        var firstList=this.slice(0..index)
        var secondList=this.slice(index+1 until this.size)
        println("$firstList,$secondList")
    }else{
        println("Index is greater than list size.")
    }
}
fun main(){
    var testList=listOf(1,"Apple",true, listOf(1,2),'c',4.2)
    testList.sliceAtGivenIndex(4)
}