package com.alansolisflores.main

fun main(args: Array<String>) {
    val person: Person = Person("Alan")
    val myView = MyView("Custom view")
    myView.printName();
    var rectangle = Rectangle()
}

/*
 * All classes inheritance from class Any
 * Any contain methods equals(), hashCode(), toString()
 *
 */

class Person {
    init {
        println("Init class")
    }
    
    constructor(firstName: String){
        println(firstName)
    }
}

//Abstract
open class View{

    var name: String = ""

    open val id: Int = 0

    open fun printName(){
        println(name)
    }

    constructor(name: String){
        this.name = name
    }
}

class MyView(name: String) : View(name) {

    //You can also override a val with a var, but not vice versa.
    //Because val implements to get method, then, when you declare var
    //implements set method.
    override var id = 1

    override fun printName(){
        println("MyView print name override with id $id")
    }
}


interface Shape{
    val vertexCount: Int
}

class Rectangle : Shape{
    override val vertexCount: Int = 4;

    constructor(){
        println("I am rectangle and I have $vertexCount vertexs")
    }
}