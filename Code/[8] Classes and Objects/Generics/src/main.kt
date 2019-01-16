fun <T>Print(value: ArrayList <T>)
{
    println(value);
}

fun main(args: Array<String>)
{
    var arr = arrayListOf<Float>(1.0f, 2.0f, 3.0f, 4.0f);
    var arr2 = arrayListOf<Int>(1, 2, 3, 4);
    Print(arr2);
}
