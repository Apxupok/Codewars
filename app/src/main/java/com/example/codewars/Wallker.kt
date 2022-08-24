package com.example.codewars

import kotlin.math.*

fun main() {
    println(solve(15, 15, 19, 50, 29, 55).contentToString())
}
fun solve(a:Int, b:Int, c:Int, alpha:Int, beta:Int, gamma:Int):IntArray {
    var rad = PI/180
    var a = arrayOf(cos(rad*alpha)*a,sin(rad*alpha)*a)


    var b = arrayOf(-sin(rad*beta)*b+a[0], cos(rad*beta)*b+a[1])


    var c = arrayOf(-cos(rad*gamma)*c+b[0], -sin(rad*gamma)*c+b[1])


    var length =  sqrt(c[0]*c[0]+c[1]*c[1]).roundToInt()
    var angle = 180+atan(c[1]/c[0])*180/PI
    val degree = angle.toInt()
    val minutes = ((angle-degree)*60).toInt()
    val seconds = (((angle-degree)*60 - minutes)*60).toInt()


    return arrayOf(length,degree,minutes,seconds).toIntArray()
}