fun main(args: Array<String>)
{
    var map: Map<Int, String> = mapOf<Int, String>(1 to "Hello", 20 to "World", 5 to "!!!");

    println(map[20]);

    println();

    for (key in map.keys)
    {
        println(map.get(key));
    }

    println();

    var nonGeneric = mapOf(10 to 5, "Hello" to "World");

    for (key in nonGeneric.keys)
    {
        println(nonGeneric[key]);
    }
}
