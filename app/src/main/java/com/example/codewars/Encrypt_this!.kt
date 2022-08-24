package com.example.codewars

import android.provider.UserDictionary.Words.WORD
import androidx.lifecycle.Transformations.map

fun main(){
    println(encryptThis("A wise old owl lived in an oak"))
    println(encryptThis_by_People("A wise old owl lived in an oak"))
}

fun encryptThis(text:String): String{
    // Your awesome code goes here!
    var sentence = ""

    for (word in text.split(" ").toList()){
        var arrayWord = word.split("").toMutableList()
        var lastLetter = ""
        var secondLetter = ""
        arrayWord[1] = arrayWord[1].first().code.toString()

        if (arrayWord.size > 3){
            lastLetter = arrayWord[2]
            secondLetter = arrayWord[arrayWord.size - 2]
            arrayWord[2]=secondLetter
            arrayWord[arrayWord.size - 2]=lastLetter
        }

        //println(arrayWord[1] ::class.simpleName)
        sentence += " "+arrayWord.joinToString("")

    }
        return sentence.substring(1)

}
fun encryptThis_by_People(text:String): String{
    return text.split(" ").map { it.first().toInt().toString() +
            it.drop(2).takeLast(1) +
            it.drop(2).dropLast(1) +
            it.drop(1).take(1) }.joinToString(" ")
}

