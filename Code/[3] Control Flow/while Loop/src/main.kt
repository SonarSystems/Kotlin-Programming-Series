fun main(args: Array<String>)
{
    var x = 0;

    while (x <= 100)
    {
        println(x * x);

        x++; // x += 1; or x = x + 1;
    }

    // infinite loop
    while (true)
    {
        println("Never ending Loop");
    }
}