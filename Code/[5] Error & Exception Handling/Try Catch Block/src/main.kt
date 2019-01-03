import java.lang.ArithmeticException

fun main(args: Array<String>)
{
    val num1 = 100;
    val num2 = 20;

    try
    {
        val result = num1 / num2;
        println(result);
    }
    catch (error: ArithmeticException)
    {
        println(error);
    }

    println("After the check");
}
