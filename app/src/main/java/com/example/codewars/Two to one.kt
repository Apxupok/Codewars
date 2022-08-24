package twotoone

fun main() {
    println(longest("abcdefghijklmnopqrstuvwxyz","abcdefghijklmnopqrstuvwxyz"))
}

fun longest(s1:String, s2:String):String {
    return (s1+s2).filter { it in ('a'..'z') }.toSet().sorted().joinToString("")
}
/*
fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}
 */