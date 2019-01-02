fun main(args: Array<String>)
{
    //Add(5, 8);
    Add(5);

    //EpicFunction('i', 65);
    EpicFunction(number = 65);
}

fun Add(num1: Int = 1, num2: Int = 1)
{
    println(num1 + num2);
}

fun EpicFunction(letter: Char = 'a', number: Int = 9)
{
    println("$letter and $number");
}