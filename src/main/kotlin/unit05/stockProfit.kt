fun main() {
    println("Enter the number of shares:")
    val NS = readLine()?.toInt() ?:0
    println("Enter the purchase price per share:")
    val PP = readLine()?.toDouble() ?:0.0
    println("Enter the purchase commission paid:")
    val PC = readLine()?.toDouble() ?:0.0
    println("Enter the sale price per share:")
    val SP = readLine()?.toDouble() ?:0.0
    println("Enter the sale commission paid:")
    val SC = readLine()?.toDouble() ?:0.0

    val profit = calculateProfit(NS, PP, PC, SP, SC)

    if (profit >= 0) {
        println("The sale profited $profit")
    } else {
        println("The sale lost ${-profit}")
    }
}
fun calculateProfit(
    NS: Double,
    PP: Double,
    PC: Double,
    SP: Double,
    SC: Double
): Double {
    val totalCost = NS * PP + PC
    val totalRevenue = NS * SP - SC
    return totalRevenue - totalCost
}
