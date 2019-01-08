fun main(args: Array<String>)
{
    var hMap: HashMap<Int, String> = hashMapOf<Int, String>(10 to "Hello", 5 to "World", 100 to "Frahaan");

    for (key in hMap.keys)
    {
        println(hMap[key]);
    }

    println();

    hMap.replace(10, "Pizza");

    for (key in hMap.keys)
    {
        println(hMap[key]);
    }
}
