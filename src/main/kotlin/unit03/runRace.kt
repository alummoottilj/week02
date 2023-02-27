fun main() {
    //This allows the user to enter 3 names with a number after
    val namesTime = Array(3) { readLine()!! }

    //Sorts the name by number
    namesTime.sortBy { it.toIntOrNull() }

    //Prints the names in the sorted order
    println("Sorted names:")
    println(namesTime[0])
    println(namesTime[1])
    println(namesTime[2])
}