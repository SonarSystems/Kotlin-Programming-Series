fun main(args: Array<String>)
{
    var num1 = 55;
    var num2 = 45;

    /*
        ---------------
        Logical Operators
        ---------------
     */

    // AND (&&) Operator
    println(num1 > num2 && num1 != 55);

    // OR (||) Operator
    println(num1 > num2 || num1 != 55);

    var variable = num1 > num2 || num1 != 55;

    // NOT Operator
    println(!variable);
}