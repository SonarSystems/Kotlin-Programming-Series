fun main(args: Array<String>)
{
    var x = 45;

    /*when (x)
    {
        10, 20, 30 -> println("Epic");
        in 40..49 -> println("40 - 49");
        50 ->
        {
            println("50");
            println("Everything is awesome");
        }
    }*/

    var epicVar = when (x)
    {
        10, 20, 30 -> "10, 20 or 30";
        in 40..49 -> "40 to 49";
        50 ->
        {
            println("50");
            println("Everything is awesome");
            "50";
        }
        else -> "Default";
    }

    println(epicVar);
}