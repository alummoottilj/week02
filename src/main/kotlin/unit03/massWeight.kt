import kotlin.math.pow

fun main(args: Array<String>) { //Asks the user to enter the objects mass in kilograms
    print("Enter the Mass in kilograms: ")
    val Mass = readLine()!!.toDouble()

    val Weight = Mass * 9.8//Calculates the weight of the object

    if (Weight > 1000)//Says the weight is too heavy, light, or normal based on these parameters
    println("The object is too heavy")
    if (Weight < 10)
    println("The object is too light")
    else println("The object is of a normal weight")
}