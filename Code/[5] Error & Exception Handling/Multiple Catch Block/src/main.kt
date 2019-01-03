import java.lang.ArithmeticException

fun main(args: Array<String>)
{
    val num1 = 100;
    val num2 = 20;

    var arr = IntArray(10);

    try
    {
        arr[10] = num1 / num2;
        //println(arr[9]);
    }
    catch (error: ArithmeticException)
    {
        println(error);
    }
    catch (error: ArrayIndexOutOfBoundsException)
    {
        println(error);
    }
    catch (error: Exception)
    {
        println("General Error");
        println(error);
    }

    for (value in arr)
    {
        println(value);
    }

    println("After the check");
}
