fun celsius(fahrenheit: Int): Double {
    val celsius = 5.0 / 9.0 * (fahrenheit - 32.0)
    return celsius
}
fun main() {
    println("Fahrenheit to Celsius")
    for (f in 0..20) {
        val c = celsius(f)
        println("$f  degrees fahrenheit equals $c degrees celsius")
    }
}