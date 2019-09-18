package com.alansolisflores.main

fun main(args: Array<String>) {
    var listFruits = listOf("Apple","Orange","Strawberry")
    listFruits.printAllElements()
}

fun List<String>.printAllElements(){
    for(item in this){
        println(item)
    }   
}