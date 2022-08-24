package com.example.codewars

fun main() {
    println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"))

}
fun meeting(s: String): String {
    var list = mutableListOf<Pair<String,String>>()
    s.split(";")
        .forEach {list.
        add(it.split(":")[1].uppercase() to it.split(":")[0].uppercase() )}

    return list.sortedWith(compareBy({ it.first},{it.second})).joinToString("")

}

