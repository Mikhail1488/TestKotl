fun main(args: Array<String>) {
    val arraySort = args.groupingBy { it }
        .eachCount()
        .toList()
        .sortedBy { (key, _) -> key }
        .sortedByDescending { (_, value) -> value }

    for ((k, v ) in arraySort)
        println("$k $v")
}
