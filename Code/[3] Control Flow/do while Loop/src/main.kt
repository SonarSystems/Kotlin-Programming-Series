fun main(args: Array<String>)
{
    var x = 100;

    println("While Loop");

    while (x <= 10)
    {
        println(x);

        x++; // x += 1; or x = x + 1;
    }

    println("Do While Loop");
    x = 100;

    do
    {
        println(x);

        x++; // x += 1; or x = x + 1;
    } while(x <= 10);
}