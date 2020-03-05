fun main(args: Array<String>) {
    val list = sortedMapOf<String, Int>()
    for (s in args)
        if (list.contains(s)) {
            list[s] = list[s]!! + 1
        } else list[s] = 1

    list.forEach { println(it.key + " " + it.value) }
}