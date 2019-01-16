fun main(args: Array<String>)
{
    var str: String = "Frahaan";
    var pattern = Regex("AA");
    var result = pattern.containsMatchIn(str);
    
    println(result);
}
