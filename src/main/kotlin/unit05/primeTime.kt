fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..number-1) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    return true
}
fun main(){
    isPrime(6) // false
    isPrime(13) // true
    isPrime(8893) // true
}