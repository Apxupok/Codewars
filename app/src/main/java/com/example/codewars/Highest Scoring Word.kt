package com.example.codewars

fun main() {
    println(high("man i need a taxi up to ubud"))
}
fun high(str: String) : String {
    var value = 0
    var map = mutableMapOf<Char,Int>()
    var answer = ""
    var high_word = 0

    for (i in 'a'..'z'){
        value += 1
        map += i to value
    }
   for (word in str.split(" ")){
       var sum_word = 0


      for (letter in word){
          sum_word += map[letter]?.toInt() ?:0
      }

       if (high_word < sum_word ){
           high_word = sum_word
           answer = word

       }
   }
   println(str.split(' ').maxBy { it.sumBy { it - 'a' + 1 } })


return answer

}
/*
fun high(str: String): String {
    return str.split(' ').maxBy{ it.sumBy{ it - 'a' + 1 } }!!
}
 */