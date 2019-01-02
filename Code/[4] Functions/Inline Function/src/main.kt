fun main(args: Array<String>)
{
    inlineFunc({println("Epic Call")});
}

inline fun inlineFunc(myFun:() -> Unit)
{
    myFun()
        println("Code inside this epic inline function");
}
