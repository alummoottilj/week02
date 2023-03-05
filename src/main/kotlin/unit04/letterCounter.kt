fun main() {
    print("Enter a word")
    val String = readLine()!!

    print("Enter a character")
    val Character = readLine()!![0]

    var Times = 0
    for (char in String) {
        if (char == Character) {
            Times++
        }
    }
    println("The character $Character is in the word $String $Times time.")
}