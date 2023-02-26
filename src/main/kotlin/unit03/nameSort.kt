fun main() {
    //This allows the user to enter 3 names
    val names = Array(3) { readLine()!! }

    //Sorts the names
    names.sort()

    //Prints the names in the sorted order
    println("Sorted names:")
    println(names[0])
    println(names[1])
    println(names[2])
}