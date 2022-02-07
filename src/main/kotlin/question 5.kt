fun <T>List<T>.sliceAtGivenIndex(index:Int){
    if(index in 0 until this.size){
        var firstList=this.slice(0..index)
        var secondList=this.slice(index+1 until this.size)
    }else{
        println("Index is greater than list size.")
    }
}