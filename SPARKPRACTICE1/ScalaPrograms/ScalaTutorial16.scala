import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial16 {
def main(args:Array[String]){
 
	val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "sue Browm")
 	if(employees.contains("Secretary"))
	 printf("Secretary : %s\n", employees("Secretary"))
   
	val customers = collection.mutable.Map(100 -> "Paul",101 -> "sally Smith")
	printf("cust 1: %s\n", customers(101))

	customers(100) = "Tom Marks"
	customers(102) = "Megan Swift"
	 for ((k,v) <- customers)
	   printf("%d : %s\n",k,v)
}
 }



