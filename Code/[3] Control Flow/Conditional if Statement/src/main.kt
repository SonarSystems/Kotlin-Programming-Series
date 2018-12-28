fun main(args: Array<String>)
{
    var num1 = 90;

    /*if (num1 == 67)
    {
        println("It is equal to 67");
    }
    else if (num1 == 50)
    {
        println("It is equal to 50");
    }
    else if (num1 == 9)
    {
        println("It is equal to 9");
    }
    else
    {
        println("Default statement");
    }*/

    var result = if (num1 == 67)
    {
        println("It is equal to 67");
        "67"
    }
    else if (num1 == 50)
    {
        println("It is equal to 50");
        "50"
    }
    else if (num1 == 9)
    {
        println("It is equal to 9");
        "9"
    }
    else
    {
        println("Default statement");
        "Default"
    }

    println(result);
}