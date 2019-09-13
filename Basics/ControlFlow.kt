package com.alansolisflores.main

fun main(args: Array<String>) {
    ifExpression()
    whenExpression()
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
        print("Choose a\n")
        a
    } else {
        print("Choose b\n")
        b
    }
}

//Replace switch operators
fun whenExpression(){
    val x = 1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
    }
}