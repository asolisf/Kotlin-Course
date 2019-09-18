package com.alansolisflores.main

fun main(args: Array<String>) {
    var list = listOf("apple","orange","strawberry")
    printAll(list)

    var mutableList = mutableListOf("blueberry","banana")
    //You can add or remove elements
    mutableList.add("apple")
    mutableList.removeAt(1)
    printAllMutable(mutableList)
}

//Collection interface, it´s root of collection hierarchy
//list implements collection interface
fun printAll(collection: Collection<String>){
    collection.forEach({println(it)})
}

//MutableCollection interface provide operations as add() or remove()
fun printAllMutable(collection: MutableCollection<String>){
    collection.forEach({println(it)})
}

