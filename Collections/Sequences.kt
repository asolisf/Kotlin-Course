package com.alansolisflores

fun main(args: Array<String>) {
    sequence()
}

//Iterable
fun sequence(){
    val words = "Kotlin is a great language for programmers.".split(" ")
    val lengthList = words.filter { println("filter $it"); it.length > 3 }
        .map { println("$it length ${it.length}"); it.length }
        .take(2)

    println(lengthList)
    println(lengthList.toList())
}