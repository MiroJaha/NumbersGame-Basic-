import java.lang.Exception

fun main(){

    val number=4

    println("Guess The Number Between 0 and 10: ")
    print("Please Enter The Guessing Number: ")
    val guess=readLine()
    println()

    try{
        if(guess!!.toInt()==number)
            println("You Got it!!")
        else
            println("Wrong Guess. The Answer is: $number")
    }
    catch(e:Exception){
        println("Please Enter a Number")
    }

    println("Game Over!")

}