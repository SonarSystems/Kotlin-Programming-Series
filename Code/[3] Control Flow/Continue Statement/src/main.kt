fun main(args: Array<String>)
{
    var number = 100.0f;
    var x = -10.0f;

    while (x < 10.0f)
    {
        if (x == 0.0f)
        {
            x++;
            continue;
        }

        println(number / x);
        x++;
    }
}