fun main() {
    println("What is the wholesale cost of the item?:")

    val wholesaleCost = readLine()?.toDouble() ?:
    println("What is the markup percentage?:")

    val markupPercentage = readLine()?.toDouble() ?:
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)

    println("The retail price of the item is: $retailPrice")
}
fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * (markupPercentage / 100)
    val retailPrice = wholesaleCost + markupAmount
    return retailPrice
}