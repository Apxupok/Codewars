package com.example.codewars

fun main(){
    println(incrementString("ss010"))
}
fun incrementString(str: String): String {
    val number = ((str.dropWhile { it.isLetter() || it == '0' }.toIntOrNull() ?: 0) + 1).toString()
    return str.dropLastWhile { it.isDigit() } + str.filterNot { it.isLetter() }
        .dropLast(number.length) + number
}
/*
fun incrementString(str: String) : String {
    val i = str.takeLastWhile { it.isDigit() }
    return str.dropLast(i.length) + ((i.toIntOrNull() ?: 0) + 1).toString().padStart(i.length, '0')
}
 */
