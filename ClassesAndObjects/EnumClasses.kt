package com.alansolisflores.main

fun main(args: Array<String>) {
    var direction: Direction = Direction.NORTH
    println(direction.toString())
}

//You can initialize ENUM and implements interfaces
enum class Direction{
    WEST,NORTH,SOUTH,EAST
}