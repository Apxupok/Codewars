package com.example.codewars

fun main (){
    print(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))

}
fun highAndLow(numbers: String): String {
    // ...
    var myArray = arrayOf<Int>()
    for (i in numbers.split(" ").toTypedArray()){
        myArray += i.toInt()

    }

    val min = myArray.minOrNull()
    val max = myArray.maxOrNull()

        return ("$max $min")
}
/*
fun highAndLow(numbers: String) =
    numbers.split(" ").map { it.toInt() }.run {
        "${this.maxOrNull()} ${this.minOrNull()}"
    }
 */