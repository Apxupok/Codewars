package com.example.codewars


fun main(){
    val b = arrayOf("BBB 3", "hh 3")
    val c = arrayOf("B")
    println(stockSummary(b,c))
    print(people_from(b,c))

}
fun stockSummary(lstOfArt:Array<String>, lstOfCat: Array<String>):String{

    var myAnswer = ""
    if ((lstOfCat.isNotEmpty()) && (lstOfArt.isNotEmpty())) {



        for (i in lstOfCat) {
            var mysumm = 0
            lstOfArt.onEach { mysumm += (if (i.first() == it.split(" ")[0][0]) it.split(" ")[1].toInt() else 0) }

            myAnswer += "($i : $mysumm) - "


        }
    }

    return myAnswer.dropLast(3)
}

fun people_from(lstOfArt:Array<String>, lstOfCat: Array<String>):String{
    if (lstOfArt.isEmpty()) return ""
    val counts = lstOfArt.groupingBy { it.take(1) }.fold(0) { acc, s -> acc + s.split(" ")[1].toInt() }
    println(lstOfArt.groupingBy {it.first() }.eachCount())
    return lstOfCat.joinToString(" - ") { "($it : ${counts.getOrDefault(it, 0)})" }
}