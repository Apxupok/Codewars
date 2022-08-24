package com.example.codewars

fun main() {
    println(alphabetWar("z*z*z*zs"))
}
fun alphabetWar(fight: String): String {
    val damageMap = mapOf<Char,Int>('w' to 4,'p' to 3,'b' to 2, 's' to 1,'m' to -4,'q' to -3,'d' to -2, 'z' to -1)

    var text = " $fight "
    var result = 0
    for (i in 1 until  text.length-1){
        if (text[i] != '*') {
            result += if ((text[i + 1] != '*')&& (text[i - 1] != '*')) damageMap.getOrDefault(text[i], 0) else 0
        }
    }
    if (result>0) return "Left side wins!"
    if (result<0) return "Right side wins!"
    return "Let's fight again!"
}

