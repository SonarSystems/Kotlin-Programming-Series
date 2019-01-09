fun main(args: Array<String>)
{
    var set1 = setOf(1, 2, 3, 4, 5, 6, 7, 8);

    for (item in set1)
    {
        println(item);
    }

    var set2: Set<String> = setOf("Hello", "World", "4");
    var set3: Set<Any> = setOf(1, 2, "Frahaan", true);

    println(set3.contains(4));
}
