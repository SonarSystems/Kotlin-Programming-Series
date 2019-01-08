fun main(args: Array<String>)
{
    var hMap:HashMap<Int, String> = HashMap<Int, String>();

    hMap.put(1, "Batman");
    hMap.put(2, "Yoda");
    hMap.put(3, "Superman");
    hMap.put(4, "Aquaman");
    hMap.put(5, "Sodem Yat");

    println(hMap[3]);

    for (key in hMap.keys)
    {
        println(hMap.get(key));
    }

    var hMap2:HashMap<Int, String> = HashMap<Int, String>(2);


}
