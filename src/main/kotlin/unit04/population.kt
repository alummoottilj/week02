fun main() {
    var startPopulation: Int
    do{
        print("Enter starting population with a minimum of 2:")
        startPopulation = readLine()?.toIntOrNull() ?: 0
    } while (startPopulation < 2)

    var Increase: Double
    do{
        print("Enter the average daily population increase as a percentage:")
        Increase = readLine()?.toDoubleOrNull() ?: -1.0
    } while (Increase < 0)

    var daysMultiplied: Int
    do {
        print("Enter number of days to multiply with a minimum of 1:")
        daysMultiplied = readLine()?.toIntOrNull() ?: 0
    } while (daysMultiplied < 1)

    var population = startPopulation
    for (day in 1..daysMultiplied){
        println("The $day: day population is $population")
        population += (population * Increase / 100).toInt()
    }
}