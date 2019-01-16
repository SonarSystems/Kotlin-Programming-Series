fun main(args: Array<String>)
{
    var r = 'a'..'c';
    var range = 1..100;

    /*for (value in range)
    {
        println(value);
    }*/

    /*for (value in 100 downTo 10)
    {
        println(value);
    }

    for (value in 100.downTo(10))
    {

    }

    for (value in 10.until(100))
    {

    }
    */

    for (value in 10 until 100 step 10)
    {
        println(value);
    }
}
