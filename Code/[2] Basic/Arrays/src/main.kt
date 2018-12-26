fun main(args: Array<String>)
{
    var scores = arrayOf(1, 3, 5, 78, 3);
    var names = arrayOf<String>("Bob", "Batman", "Frahaan", "Pizza", "Mash Potato");

    println(scores[1]);
    println(names[1]);

    println(scores.get(1));
    println(names.get(1));

    scores[1] = 8;
    println(scores[1]);

    scores.set(1, 67);
    println(scores[1])
}