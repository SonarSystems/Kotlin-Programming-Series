fun main(args: Array<String>)
{
    var mMap: MutableMap<Int, String> = mutableMapOf<Int, String>(10 to "Frahaan", 20 to "Hussain");

    println(mMap.get(10));

    println();

    for (key in mMap.keys)
    {
        println(mMap[key]);
    }
}
