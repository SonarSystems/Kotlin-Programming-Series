interface EpicClass
{
    fun EpicFun()
    {
        println("Epic Fun");
    }
}

abstract class Vehicle
{
    // private
    // protected
    // internal
    // public

    private var currentSpeed: Int;
    open public var maxSpeed: Int = 100;
    protected var model: String;

    init
    {
        println("Hello There");
        currentSpeed = 0;
        //maxSpeed = 120;
        model = "";
    }

    constructor()
    {
        println("Secondary Constructor");
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

    open fun SetMaxSpeed(speed: Int)
    {
        println("Parent method");
        maxSpeed = speed;
    }

    fun GetCurrentSpeed(): Int
    {
        return currentSpeed;
    }

    open fun Hello()
    {
        println("Hello there");
    }
}

class Car: Vehicle(), EpicClass
{
    var testVar = "Hello World";
    override var maxSpeed: Int = 90;

    fun Test()
    {
        model = "model";
        println("Yay");
    }

    override fun SetMaxSpeed(speed: Int)
    {
        println("Overriden method");
        maxSpeed = speed / 2;
    }

    override fun Hello()
    {
        println("Hello World");
        super.Hello();
    }
}

fun main(args: Array<String>)
{
    var car = Car();

    car.Hello();
    car.EpicFun();
}
