fun main(args: Array<String>) {
    val rooms = arrayOf(
        "dusty castle room",
        "armory",
        "torch-lit hallway",
        "bedroom",
        "kitchen"
    )
    val Descriptions= arrayOf(
        "You are in a dusty castle room. Passages lead to the north and south.",
        "You are in the armory. There is a room off to the south.",
        "You are in a torch-lit hallway. There are rooms to the east and west.",
        "You are in a bedroom. A window overlooks the castle courtyard. A hallway is to the west.",
        "You are in the kitchen. It looks like a roast is being made for supper. A hallway is to the east."
    )

    val Connections= arrayOf(
        intArrayOf(1, 2),
        intArrayOf(0, 3),
        intArrayOf(3, 4),
        intArrayOf(2),
        intArrayOf(2)
    )
    var currentRoom = 0

    while (true) {
        println(Descriptions[currentRoom])
        println("What direction?")
        val direction = readLine()
        if (direction == "end") {
            println("Thank you for playing")
            
        }
        when (direction) {
            "n" -> {
                if (0 in Connections[currentRoom]) {
                    currentRoom = 0
                } else {
                    println("Can't go that way.")
                }
            }
            "s" -> {
                if (1 in Connections[currentRoom]) {
                    currentRoom = 1
                } else {
                    println("Can't go that way.")
                }
            }
            "e" -> {
                if (2 in Connections[currentRoom]) {
                    currentRoom = 2
                } else {
                    println("Can't go that way.")
                }
            }
            "w" -> {
                if (3 in Connections[currentRoom]) {
                    currentRoom = 3
                } else {
                    println("Can't go that way.")
                }
            }
            else -> {
                println("Enter 'n' for north, 's' for south, 'e' for east, or 'w' for west.")
            }
        }
    }
}
