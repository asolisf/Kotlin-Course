package com.alansolisflores.main

fun main(args: Array<String>) {
    ifExpression()
    whenExpression()
    forLoop()
    whileLoop()
}

fun ifExpression(){
    val a = 1
    val b = 2

    // Traditional usage 
    var max: Int = a 
    if (a < b) {
         max = b
    }

    // With else 
    if (a > b) {
        max = a
    } else {
        max = b
    }

    //as expression
    max = if (a > b) a else b

    // The last expression is the value of a block
    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}

//Replace switch operators
fun whenExpression(){
    val x = 1
    when (x) {
        1 -> println("x == $x")
        2 -> println("x == $x")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    //Is a particular type. Cast implicit
    when (x){
        is Int -> println("x is Int")
        else -> {
            println("x doesn´t is Int")
        }
    }

    //Use when as a replacement of if-ifelse-else
    when {
        (x > 0) -> println("x is bigger than 0.")
        (x < 0) -> println("x is smaller than 0.")
        else -> {
            println("$x is 0")
        }
    }
}

fun forLoop(){
    var sequence = Array(15) {i -> (i+i).toString()}

    for(item in sequence){
        println("$item")
    }
}

fun whileLoop(){

    var x: Int = 0

    while(x <= 10){

        println("x == $x")
        x++
    }
}