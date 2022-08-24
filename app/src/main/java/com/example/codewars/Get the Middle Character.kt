package com.example.codewars

fun main(){
    println(getMiddle("test"))
}
fun getMiddle(word: String):String{

    println()

    println(word.substring(word.toCharArray().indices))

    return if (word.length % 2 == 0) word[word.length/2-1].toString()+word[word.length/2].toString()
    else word[word.length/2].toString()

}
/*
fun getMiddle(word : String) : String {
    val len = word.length
    return word.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
}

 */