package com.example.codewars

fun main() {
    println(toCamelCase("sss_ss"))
    println("Но я уже спасен, потому что машины бессмертны".split(" ")
        .mapIndexed{index, value -> value.repeat(index)})

}
fun toCamelCase(str:String):String =

    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it
        .replaceFirstChar(Char::titlecase) else it }
        .joinToString("")

