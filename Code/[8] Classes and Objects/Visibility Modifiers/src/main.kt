import kotlin.math.max

class Car
{
    // private
    // protected
    // internal
    // public

    private var currentSpeed: Int;
    public var maxSpeed: Int;
    var model: String;

    init
    {
        println("Hello There");
        currentSpeed = 0;
        maxSpeed = 120;
        model = "";
    }

    constructor(m: String)
    {
        println("Secondary Constructor");
        model = m;
    }

    fun SetModel(m: String)
    {
        model = m;
    }

    fun SetCurrentSpeed(speed: Int)
    {
        if (speed >= 0 && speed <= maxSpeed)
        {
            currentSpeed = speed;
        }
    }

    fun SetMaxSpeed(speed: Int)
    {
        maxSpeed = speed;
    }

    fun GetCurrentSpeed(): Int
    {
        return currentSpeed;
    }
}

fun main(args: Array<String>)
{
    var car1 = Car("Honda");
    var car2 = Car("Toyota");

    car1.SetModel("BMW");
    car1.SetMaxSpeed(20);


    println(car1.GetCurrentSpeed());
    println(car1.model);
    println(car1.maxSpeed);

    println(car2.model);
    println(car2.maxSpeed);
}
