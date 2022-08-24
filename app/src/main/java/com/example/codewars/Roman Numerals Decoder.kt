package com.example.codewars

import kotlin.String as String

fun main(){
    println(decode("CLXXXIX"))
    println(people("CLXXXIX"))


}
fun decode(str: String):Int {
    var sum = 0
    var x1 = 0
    for (i in str.toCharArray().reversed()){
       var x0 = when (i){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }

        sum += if (x0 < x1) - x0 else + x0

        x1 = x0
    }
    return sum
}

val numbersMap = mapOf('M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50, 'X' to 10, 'V' to 5, 'I' to 1)

private fun people(str: String): Int {

    var rawNumbers = str.map { char -> numbersMap.getOrElse(char, { null }) }.filterNotNull()
    println(rawNumbers.map { it -> 's'})
    var normalizedNumbers = rawNumbers.mapIndexed { i, num -> if (num < rawNumbers.elementAtOrElse(i + 1) { Int.MIN_VALUE }) -num else num }
    return normalizedNumbers.toIntArray().sum()
}



