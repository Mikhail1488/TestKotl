fun main(args: Array<String>) {
    val sortedStringArray = args.asList().sorted()
    var arrayStringUnique : MutableList<String> = mutableListOf()
    for (s in sortedStringArray) {
        if (!arrayStringUnique.contains(s))
            arrayStringUnique.add(s)
    }
    arrayStringUnique.forEach { println(it) }
}