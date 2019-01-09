fun main(args: Array<String>)
{
    var set1 = mutableSetOf<Int>(1, 2, 3, 4, 5, 6);

    for (item in set1)
    {
        println(item);
    }

    set1.add(108);

    println();

    for (item in set1)
    {
        println(item);
    }

    set1.remove(2);

    println();

    for (item in set1)
    {
        println(item);
    }
}
