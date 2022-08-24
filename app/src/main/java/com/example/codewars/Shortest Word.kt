package com.example.codewars

fun main() {
    println(findShort("Let's travel abroad shall we"))

}
fun findShort(s: String): Int = s.split(" ").minOf{it.length}