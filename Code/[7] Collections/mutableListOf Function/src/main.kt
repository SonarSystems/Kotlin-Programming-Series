fun main(args: Array<String>)
{
    var mList = mutableListOf(10, 20, 40, 80);

    for (item in mList)
    {
        println(item);
    }

    mList.add(65);

    println();

    for (item in mList)
    {
        println(item);
    }

    mList.add(1, 27);

    println();

    for (item in mList)
    {
        println(item);
    }
}
