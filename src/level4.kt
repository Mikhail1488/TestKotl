fun main(args: Array<String>) {
    val sortStringList = args.asList().sorted()
    var count = 0
    var nstr = sortStringList[0]
    for(i in 0 until (sortStringList.size)){
        if(sortStringList[i] != nstr){
            nstr = sortStringList[i]
            println(sortStringList[i-1] + " " + count)
            count = 1
        }
        else count++
    }
    println(sortStringList[(sortStringList.size) - 1] + " " + count)

}