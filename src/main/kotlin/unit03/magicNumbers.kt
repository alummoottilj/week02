import kotlin.math.pow

fun main(args: Array<String>) { // Enter the month day and two digit year
    print("Enter a Month: ")
    val Month = readLine()!!.toInt()

    print("Enter a Day: ")
    val Day = readLine()!!.toInt()

    print("Enter a two digit Year: ")
    val Year = readLine()!!.toInt()

    if (Month * Day == Year ) { // If the month times day equals the year the date is magic.
        print("The date you entered is magic")
    } else {
        print("The date you entered is not magic")
    }
}