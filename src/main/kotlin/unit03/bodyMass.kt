import kotlin.math.pow

fun main(args: Array<String>) { //Asks the user to enter their height and weight in pounds and inches
    print("Enter your Weight in pounds: ")
    val Weight = readLine()!!.toDouble()

    print("Enter your Height in Inches: ")
    val Height = readLine()!!.toDouble()

    val BMI = Weight * 703 / (Height * Height) //The formula to calculate BMI

    when {//The BMI is deemed to be optimal, underweight, or overweight based on these parameters
        BMI in 18.5..25.0 -> println("Your BMI is optimal")
        BMI > 25 -> println("Your BMI is overweight")
        BMI < 18.5 -> println("Your BMI is underweight")
    }
}
