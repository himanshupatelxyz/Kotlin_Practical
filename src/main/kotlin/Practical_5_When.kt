fun main(){

    //no ternary operator in kotlin
    var a=10
    var b=20

    val max= if ( a>b ) a else b
     println("Please enter the month number")
    //when as switch
    val monthNumber= readLine()!!.toInt()
    when(monthNumber){
        1->{
            println("January")
        }
        2->{
            println("February")
        }
        3->{
            println("March")
        }
        4->{
            println("April")
        }
        5->{
            println("May")
        }
        6->{
            println("June")
        }
        7->{
            println("July")
        }
        8->{
            println("August")
        }
        9->{
            println("September")
        }
        10->{
            println("October")
        }
        11->{
            println("November")
        }
        12->{
            println("December")
        }
        else->{
            println("please enter proper number")
        }
    }

}