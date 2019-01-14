data class EpicClass(var str: String = "Default", var i: Int = 10);

fun main(args: Array<String>)
{
    var epic = EpicClass("Batman", 30);

    println(epic);
    /*println(epic.i);

    epic.i = 78;

    println(epic.i);*/

    var epic2 = EpicClass(i = 55);
    println(epic2);
}
