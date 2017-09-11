//0 1 1 2 3 5 8 13 21 34 

object Fibanochi1 {
def feb(n:Int):Int = {
        n match {
    case i if i< 2=> i
    case i => feb(n-1) + feb(n-2)
}}
 for(i<- 1 to 10){
println(" " +feb(i))
}
}
