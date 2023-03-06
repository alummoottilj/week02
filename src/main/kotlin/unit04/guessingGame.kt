
fun main() {
    val random = Random()
    var randomNumber = random.nextInt(500)
    var guessNumber: Int?
    do {
        print("Guess the number up to 500: ")
        guessNumber = readLine()?.toIntOrNull()

        if (guessNumber == null) {
            println("Invalid input. Please enter a number.")
        } else if (guessNumber > randomNumber) {
            println("Too high, try again.")
        } else if (guessNumber < randomNumber) {
            println("Too low, try again.")
        }
    } while (guessNumber != randomNumber)

    println("You guessed the number correctly.")
}