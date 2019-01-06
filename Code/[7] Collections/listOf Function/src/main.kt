fun main(args: Array<String>)
{
    var basicList = listOf(1, 2, 3);

    for (item in basicList)
    {
        println(item);
    }

    println();

    var basic2List = listOf(1, "Hello", 3, "World", "Frahaan");

    for (item in basic2List)
    {
        println(item);
    }

    println();

    var intList: List<Int> = listOf<Int>(10, 20, 30, 40, 50);

    for (item in intList)
    {
        println(item);
    }

    var anyList: List<Any> = listOf<Any>(10, 20, "Frahaan");

    for (item in anyList)
    {
        println(item);
    }

    println(anyList.get(1));
}
