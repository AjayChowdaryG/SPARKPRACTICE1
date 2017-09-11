object Example {
    
   def main(args: Array[String]) {
      var numbers = List(20,30,60,80,90);
      var N:Int=0;
      var sum: Int=0;
      
     for ( N <- numbers ) {
         sum+= N;
      }      
      println("Sum of all array elements: "+sum);

   }
}
