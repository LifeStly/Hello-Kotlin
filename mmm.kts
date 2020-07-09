fun main(args: Array<String>) {
    var fortune: String = ""
    repeat (10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}