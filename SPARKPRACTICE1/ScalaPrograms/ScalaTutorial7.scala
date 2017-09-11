object ScalaTutorial7 {
  def main(args:Array[String]){
   var i = 0
     def printPrimes(){
	val printList = List (1,2,3,5,7,11)
	for(i <- printList){
	  if(i == 7) {
            return
            }    
	if(i !=1){
	  println(i)
     }
   }
}
printPrimes
}
}
