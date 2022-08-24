package com.example.codewars

fun main(){
    println(printerError("aaaxbbbbyyhwawiwjjjwwm"))
    println("aaaxbbbbyyhwawiwjjjwwm".toList().count{it != 'a'})

}
fun printerError(s: String): String {

    var sum = 0
    s.toCharArray().onEach {sum += (if (it !in 'a'..'m') 1 else 0)}

    return "$sum/${s.length}"
    //list ::class.simpleName.toString()
}
private fun people(s: String) = "${s.count { it !in 'a'..'m' }}/${s.length}"