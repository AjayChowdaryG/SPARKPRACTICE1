import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial15 {
def main(args:Array[String]){

   val favNums = new Array[Int](20)
    val friends = Array("srinu","santosh","Ajay","Kumar")
   friends(0) = " sue"
   println("Best friends " + friends(2))
    val friends2 = ArrayBuffer[String]()
	friends2.insert(0,"phil")
	friends2 += "mark"
	friends2 ++= Array("susy","paul")
	friends2.insert(1,"aaa","bbbb","ccccc","dddd")
	friends2.remove(1,2)
	var friend : String = " "
	for (friend <- friends2)

	 println(friend)


 	   for(j <- 0 to (favNums.length -1)){
	   favNums(j) = j
	    println(favNums(j))
   }
	val favNumsTimes2 = for(num <-favNums)   yield 2 * num 
	 favNumsTimes2.foreach(println)

	 var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num
	 favNumsDiv4.foreach(println)

	var mulTable = Array.ofDim[Int](10,10)
	 for(i <- 0 to 9){
	  for(j <- 0 to 9){
	   mulTable(i)(j) = i * j
        	}
	}
	for(i <- 0 to 9){
 	for(j <- 0 to 9){
	   printf("%d : %d = %d\n", i,j,mulTable(i)(j))

           }
         }
	println("sum : " + favNums.sum)
	println("min : " + favNums.min)
	println("max : " + favNums.max)
	val sortedNums = favNums.sortWith(_<_)
	println(sortedNums.deep.mkString(" , "))
       }
     }
