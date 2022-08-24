package com.example.codewars

import java.util.Collections.max

fun main() {
    println(mirror("kbbwdcp xb fdi"))
    var y = 3
    println(listOf("a","bb","ccc").max())
    println("s".repeat(5))
    println(listOf("kbbwdcp xb fdi".split(" ")).map {  })

}


fun mirror(text: String): String {
    
    var edgeLine = "****"
    var max = 0
    var rightLine = ""
    var myArray = text.split(" ")
    myArray.forEach { max = if(it.length > max) it.length else max }

    repeat(max){
        edgeLine += "*"
    }
    for (i in myArray){

        rightLine += "* ${i.reversed()} "
        repeat(max  - i.length){
            rightLine +=" "
        }
        rightLine += "*\n"

    }


    return "$edgeLine\n$rightLine$edgeLine"
}
