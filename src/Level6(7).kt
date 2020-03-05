import java.util.*

fun main(args: Array<String>) {
    val list = (if (args.isEmpty()) {
        Scanner(System.`in`).nextLine()
            .split("[\\s\\n\\r\\t]".toRegex())
            .toTypedArray()
    } else args
    )
    val arraySort = list.groupingBy { it }
        .eachCount()
        .toList()
        .sortedBy { (key, _) -> key }
        .sortedByDescending { (_, value) -> value }

    for ((k, v ) in arraySort)
        println("$k $v")
}





