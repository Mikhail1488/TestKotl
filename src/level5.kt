fun main(args: Array<String>) {
    val sortStringList = args.asList().sorted()
    var listStringUnique : MutableList<String> = mutableListOf()
    var intList  = ArrayList<Int>(listStringUnique.size)
    for (s in sortStringList) {
        if (!listStringUnique.contains(s))
            listStringUnique.add(s)
    }
    //получаем список параметров количества уникальных слов в порядке убывания
    var count = 0
    var nstr = sortStringList[0]
    for(i in 0 until (sortStringList.size)){
        if(sortStringList[i] != nstr){
            nstr = sortStringList[i]
            intList.add(count)
            count = 1
        }
        else count++
    }
    intList.add(count)

    val intArray : IntArray  = intList.toIntArray()
    val stringArray = listStringUnique.toTypedArray()
    var flag =true
    var temp : Int
    var strtemp : String
    while (flag) {
        flag = false
        for (i in 0 .. intArray.size - 2 ) {
            if (intArray[i] < intArray[i + 1]) {
                temp = intArray[i]
                strtemp = stringArray[i]
                intArray[i] = intArray[i + 1]
                stringArray[i] = stringArray[i + 1]
                intArray[i + 1] = temp
                stringArray[i + 1] = strtemp
                flag = true
            }
        }
    }
    for (i in stringArray.indices)
        println(stringArray[i] + "  " + intArray[i])

}
