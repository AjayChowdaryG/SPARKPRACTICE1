object ScalaTutorial5 {
  def main(args: Array[String]){
   var i =0 
    var evenList = for {i <- 50 to 200
      if (i% 2) == 0
      } yield i

   for (i <- evenList)
    println(i)
 }
}
