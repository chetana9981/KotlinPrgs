package exception

import java.lang.Exception

fun main(args: Array<String>) {
    try{
        checkAgeEligiblity(2)
    }
    catch (e:Exception){
        println(e.message)
    }

}
fun checkAgeEligiblity(age:Int){
    if(age>=18)
        println("You are Eligible to vote ")
    else
        throw Exception("You are Not Eligible to vote ")
}