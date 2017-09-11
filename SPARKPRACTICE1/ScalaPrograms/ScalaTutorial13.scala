import scala.io.StdIn.{readLine,readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial13 {
def main(args:Array[String]){
 def getSum(args : Int*) : Int = {
  var sum : Int = 0
   for (num <- args){
    sum += num
     }
    sum
    }
   println("Get Sum " + getSum(1,2,3,4,5,6,7,8,9))

   }
   }



