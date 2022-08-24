package com.example.codewars

fun main() {
    println(sum(listOf(1,2,3,4,"2","2")))

}
fun sum(mixed: List<Any>): Int = mixed.sumOf { it.toString().toInt()*2 }
/*{
var answer = 0
println(mixed.joinToString(",").replace(",","").forEach { answer += it.digitToInt()})


return answer;

 }*/


