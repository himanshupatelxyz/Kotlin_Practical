import java.util.StringJoiner

fun main(){
   println("Type conversion")
   var a:Int=10
   var int:Int=20
   println("Integer value:"+a)
   var b:Double
   b=a.toDouble()
   println("Double value (From Integer):"+b)
   var c:String="10"
   var str:String="A"
   var strtoint:Int?=c.toIntOrNull()
   var strtoint1:Int?=str.toIntOrNull()
//   var strtoint1:Int=str.toInt()!!
   //var strtoint1:Int=str.toInt()
   var float:Float=int.toFloat()
   println("Int to Float:"+float)
   var f:Float=30.40f
   var floattoint:Int=f.toInt()
   println("float to Int is:"+floattoint)
   println("Integer value1 from string:"+strtoint)
  println("Integer value2 from string:"+strtoint1)
}