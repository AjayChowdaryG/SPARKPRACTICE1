import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial10 {
 def main (args:Array[String]){

	var randSent = "I saw a dragon fly away"
	println("4th index : " + randSent(10))
	println("String length : " + randSent.length)
	println(randSent.concat(" and explod"))
	println("dragon starts at index " + 
	      randSent.indexOf("dragon"))

	//val randSentArray = randSent.toArray
	//for(v <- randSentArray)
	 // println(v)

  }
}
