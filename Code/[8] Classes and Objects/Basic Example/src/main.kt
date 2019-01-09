class Car
{
    var currentSpeed: Int = 0;
    var maxSpeed: Int = 120;
    var model: String = "";

    fun SetModel(m: String)
    {
        model = m;
    }

    fun SetCurrentSpeed(speed: Int)
    {
        currentSpeed = speed;
    }

    fun SetMaxSpeed(speed: Int)
    {
        maxSpeed = speed;
    }
}

fun main(args: Array<String>)
{
    var car1 = Car();
    var car2 = Car();

    car1.SetModel("BMW");
    car1.SetMaxSpeed(20);

    println(car1.model);
    println(car1.maxSpeed);

    println(car2.model);
    println(car2.maxSpeed);
}
