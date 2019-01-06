fun main(args: Array<String>)
{
    var string1: String? = null;
    var string2: String? = "Hello World";

    /*var length1: Int = if (string1 != null) string1.length else -1

    var length2: Int = if (string2 != null) string2.length else -1*/

    var length1: Int = string1 ?.length ?: -1;
    var length2: Int = string2 ?.length ?: -1;

    println(length1);
    println(length2);
}
