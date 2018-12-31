fun main(args: Array<String>)
{
    CountUp(0, 10);
}

fun CountUp(startingNumber:Int, number: Int)
{
    println(startingNumber);

    var nextNumber = startingNumber + 1;

    if (startingNumber < number)
    {
        CountUp(nextNumber, number);
    }
}