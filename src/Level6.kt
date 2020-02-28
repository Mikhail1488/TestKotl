fun main(args: Array<String>) {
    //Коллекции для хранения различных данных
    val sortStringList : List<String>
    val argsFromConsole :ArrayList<String> = ArrayList()
    val listStringUnique : MutableList<String> = mutableListOf()
    val intList  = ArrayList<Int>(listStringUnique.size)
    //Проверка на ввод программных аргументов
    if (args.isEmpty()) {
        println("Програмные аргументы отсутствуют, введите их ")
        val input = readLine()
        argsFromConsole.addAll(input!!.split(" "))
        sortStringList = argsFromConsole.sorted()
        }
    else sortStringList = args.asList().sorted()

    //Заполнение списка уникальных элементов списка
    for (s in sortStringList) {
        if (!listStringUnique.contains(s))
            listStringUnique.add(s)
    }
    //Заполнение списка  количества уникальных слов в порядке убывания
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

    //Сортировка полученных данных сначала по количеству повторений определенного элемента, затем по алфавиту
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


