fun main() {
    print("Enter a positive nonzero integer number: ")
    var Number = readLine()!!.toInt()
    var Sum = 0
    for (i in 1..Number) {
        Sum += i
    }
    println("The sum of all whole numbers from 1 to $Number is $Sum")
}