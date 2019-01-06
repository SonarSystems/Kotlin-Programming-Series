fun main(args: Array<String>)
{
    var epicVar: Any?;
    epicVar = null;

    epicVar = 9;

    if (epicVar != null)
    {
        println("Not null");
    }

    if (epicVar is Int)
    {
        println("Epic variable is an integer");
    }
}
