fun main() {
    val responses = arrayOf(
        "Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap.",
        "No way!",
        "I don’t think so.",
        "Without a doubt, no.",
        "The answer is clearly NO."
    )

    while (true) {
        println("Ask a yes or no question (or type quit to exit):")
        val input = readLine()
        when (input) {
            "quit" -> {
                println("Thank you for playing.")
                return
            }
            else -> println(responses.random())
        }
    }
}
