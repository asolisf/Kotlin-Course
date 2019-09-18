package com.alansolisflores.main

fun main(args: Array<String>) {
    val user = User("Alan")
    val secondUser = user.copy();
    user.age = 15;
    secondUser.age = 27
    println(user.toString())
    println(secondUser.toString())

    //Destructuring declaration
    val (name) = user;
    println(name)
}

//Class whose purpose is to hold data.
//This content additional methods that Any() class
//as copy()
data class User(val name: String){
    var age: Int = 0
}