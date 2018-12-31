fun main(args: Array<String>)
{
    var number = Addition(4, 5);

    println(number);

    println(number * number);
}

fun Addition(num1: Int, num2: Int): Int
{
    val result = num1 + num2;

    return result;
}