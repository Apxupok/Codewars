package com.example.codewars

import kotlin.math.abs


fun main() {
    println(sum(intArrayOf(1, -2, 3, 4, 5)))
}
fun sum(numbers: IntArray): Int = numbers.sumOf { if (it>0) it else 0 }
