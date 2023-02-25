import kotlin.math.pow

fun main(args: Array<String>) { //Asks user to enter a number 1 to 10
    print("Enter a number 1 to 10:")
    val number = readLine()!!.toInt()

    when (number) { //If the number entered is 1 to 10, it will print the roman numeral.
        1 -> println("The number is I")
        2 -> println("The number is II")
        3 -> println("The number is III")
        4 -> println("The number is IV")
        5 -> println("The number is V")
        6 -> println("The number is VI")
        7 -> println("The number is VII")
        8 -> println("The number is VIII")
        9 -> println("The number is IX")
        10 -> println("The number is X")
        else -> println("Please enter a number 1 to 10")

    }
}
