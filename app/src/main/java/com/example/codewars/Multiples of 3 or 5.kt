package com.example.codewars

fun main() {
    println(solution(200))
    print(myFunction(15,5).joinToString (" "))
}
fun solution(number:Int):Int{
    var summ = 0
    for (i in 0..(number-1)){

        if ((i % 3 == 0)||(i % 5 == 0)){
            summ += i
        }

    }
    return summ
}
//fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()

fun myFunction(number: Int,section: Int):Array<Int>{
    return (1 .. number).filter { it % 2 == 0 && it % 3 ==0 && (section-it/3)>0 }.toTypedArray()
}