fun main(args: Array<String>)
{
    var epicAList = arrayListOf<Int>(3, 5, 7);

    for (item in epicAList)
    {
        println(item);
    }

    println();

    epicAList.add(67);

    for (item in epicAList)
    {
        println(item);
    }

    println();

    epicAList.add(2, -7);

    for (item in epicAList)
    {
        println(item);
    }

    println(epicAList.get(0));

    println();

    epicAList.set(0, 9);

    for (item in epicAList)
    {
        println(item);
    }
}
