import java.lang.ArithmeticException

fun main(args: Array<String>)
{
    val num1 = 100;
    val num2 = -20;

    try
    {
        if (num2 < 0)
        {
            throw ArithmeticException("No minus numbers")
        }

        val result = num1 / num2;
        println(result);
    }
    catch (error: ArithmeticException)
    {
        println(error);
    }
    finally
    {
        println("Finally");
    }

    println("After the check");
}
