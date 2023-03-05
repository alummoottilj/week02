fun main() {
    val sales = IntArray(5)
    for (storeNum in 1..5) {
        print("Enter sales for each store $storeNum: ")
        sales[storeNum - 1] = readLine()?.toInt() ?: 0
    }
    for (storeCount in 1..5) {
        print("Store $storeCount:")
        for (asterisks in 1..sales[storeCount - 1] / 100) { print("*")
        }
        println()
    }
}


