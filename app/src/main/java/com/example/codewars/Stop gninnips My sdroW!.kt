package com.example.codewars

fun main() {
    println(spinWords("Just kidding there is still one more"))

}
fun spinWords(sentence: String): String {
    val str = mutableListOf<String>()
    sentence.split(" ").forEach { str += if(it.length<5) it else it.reversed() }
    return str.joinToString(" ")
}

// После джойна так можно fun spinWordFromOther(s:String) = s.split(" ").joinToString(" "){it.uppercase()}

