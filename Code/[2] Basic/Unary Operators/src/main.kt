fun main(args: Array<String>)
{
    var num1 = 55;

    /*
        ---------------
        Unary Operators
        ---------------
     */

    // Unary Plus
    println(+num1);

    // Unary Minus
    println(-num1);

    // Pre Increment
    println(++num1); // num1 = num1 + 1; or num1 += 1;

    // Post Increment
    println(num1++); // num1 = num1 + 1; or num1 += 1;
    println(num1);

    // Pre Decrement
    println(--num1); // num1 = num1 - 1; or num1 -= 1;

    // Post Decrement
    println(num1--); // num1 = num1 - 1; or num1 -= 1;
    println(num1);

    var epicValue = false;

    println(!epicValue);
}