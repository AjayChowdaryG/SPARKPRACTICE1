object ExampleArray1 {
    
   def main(args: Array[String]) {
       
      var numbers = List(20,30,60,80,90);
      var N:Int=0;
      
      //print all array elements
      println("All array elements: ");
      for ( N <- numbers ) {
         println(N);
      }
      //calculating SUM of all elements
      var sum: Int=0;
      for ( N <- numbers ) {
         sum+=N;
      }      
      println("Sum of all array elements: "+sum);

   }
}
