package com.example.codewars

fun main(){
    print(fizzBuzz(30).joinToString())
}
fun fizzBuzz(n: Int): Array<String> {
    //TODO: Enter your code here!
    var list = arrayOf<String>()
    for (i in 1..n) {
        if ((i % 5 == 0) && (i % 3 == 0)) {
            list += "FizzBuzz"
        } else if (i % 5 == 0) {
            list += "Buzz"
        } else if (i % 3 == 0)
            list += "Fizz"
        else {
            list += i.toString()
        }
    }
    return list
}
