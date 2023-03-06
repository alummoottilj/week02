
fun main() {
    val random = Random()
    var randomNumber = random.nextInt(500)
    var guessNumber: Int?
    var guessCount = 0
    do {
        print("Guess the number up to 500: ")
        guessNumber = readLine()?.toIntOrNull()
        guessCount++

        if (guessNumber == null) {
            println("Invalid input. Please enter a number.")
        } else if (guessNumber > randomNumber) {
            println("Too high, try again.")
        } else if (guessNumber < randomNumber) {
            println("Too low, try again.")
        }
    } while (guessNumber != randomNumber)

    println("You guessed the number correctly in $guessCount tries.")
}