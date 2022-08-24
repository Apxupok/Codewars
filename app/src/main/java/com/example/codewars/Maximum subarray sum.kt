package com.example.codewars

import java.lang.Math.max


fun main(){
    println(maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(listOf(1,2,3,4,5).indices)
    print(listOf(1,2,3,4,5).forEach {println(it) })

}
/*
fun maxSequence(arr: List<Int>): Int{
    var best_sum = 0
    var curr_sum = 0
    for (i in arr){
        curr_sum = max(0, curr_sum + i)
        best_sum = max(best_sum, curr_sum)

    }

    return best_sum
}

 */



fun maxSequence(arr: List<Int>): Int {
    var max = 0
    arr.indices.forEach { outer ->
        (outer..arr.size).forEach { inner ->
            max = max(arr.subList(outer, inner).sum(), max)
        }
    }
    return max
}



