package com.example.codewars

fun main() {
    println(abbrevName("P Favuzzi"))
}
fun abbrevName(name:String) = name.split(" ").fold("") { acc, s -> acc + s[0].toUpperCase() + "." }.dropLast(1)