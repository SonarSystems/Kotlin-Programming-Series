import java.lang.NumberFormatException

fun main(args: Array<String>)
{
    var string = Convert("-8");
    println(string);
}

fun Convert(strVar: String): Int
{
    return try
    {
        Integer.parseInt(strVar);
    }
    catch (error: NumberFormatException)
    {
        0;
    }
}
