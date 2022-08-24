package com.example.codewars



fun main() {
    println(duplicateCount("abcdeaB"))

}
fun duplicateCount(text: String): Int {
    var list = mutableListOf<Int>()
    text.groupBy({it.uppercase()},{it}).forEach { list += it.value.size }
    return list.count { it > 1 }
    println()
}
/*
fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }

fun duplicateCount(text: String): Int {
    return text.groupingBy { it.toLowerCase() }.eachCount().values.count { it > 1 }
}
 */