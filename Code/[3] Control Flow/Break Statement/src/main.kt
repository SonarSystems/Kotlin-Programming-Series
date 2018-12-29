fun main(args: Array<String>)
{
    var i = 0;

    loop@ while (i < 5)
    {
        var x = 0;

        while (x < 10)
        {
            if (x == 4)
            {
                //break;
                break@loop;
            }

            println("i is $i and x is $x");
            x++;
        }

        i++;
    }
}