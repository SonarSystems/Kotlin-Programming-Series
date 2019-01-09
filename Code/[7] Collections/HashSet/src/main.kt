fun main(args: Array<String>)
{
    var set = HashSet<Int>(10);

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(6);
    set.add(7);
    set.add(8);
    set.add(9);
    set.add(10);

    for (item in set)
    {
        println(item);
    }

    println(set.size);

    println(set.contains(11));
}
