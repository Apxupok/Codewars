package com.example.codewars



fun main(){
    //contentDeepToString()
    println(multiplicationTable(4).contentDeepToString())
    println(myFun(3).contentDeepToString())
    println(listOf(1,5,3).fold("Elements") { r: String, s: Int -> r + s })
}
fun multiplicationTable(size: Int)= Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
fun myFun(size: Int) = Array(size) {x -> IntArray(size) {y -> (x + 1) * (y + 1)} }

