import kotlin.math.pow
    fun main(args: Array<String>) { //The user enters the month day and two digit year
    print("Enter a Month: ")
    val Month = readLine()!!.toInt()

    print("Enter a Day: ")
    val Day = readLine()!!.toInt()

    print("Enter a two digit Year: ")
    val Year = readLine()!!.toInt()

    if (Month * Day == Year ) // The numbers are calculated and if the month times day is equal to the year is is magic.
        print("The date you entered is magic!")
    else print("The date you entered is not magic!")
}


