sealed class Shape
{
    class Circle(var radius: Float);
    class Square(var length: Float);
    class Rectangle(var width: Float, var height: Float);
}

fun main(args: Array<String>)
{
    var s = Shape.Circle(6.0f);

    println(s.radius);
}
