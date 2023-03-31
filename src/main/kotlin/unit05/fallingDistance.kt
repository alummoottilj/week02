fun main() {
    for (time in 1..10) {
        val distance = fallingDistance(time)
    println("The object fell $distance meters in $time seconds.")
    }
}
fun fallingDistance(time: Int): Double {
    val g = 9.8
    val distance = 0.5 * g * time * time
    return distance
}