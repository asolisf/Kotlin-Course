/*
* This is a block comment
*/

package com.alansolisflores

import java.util.*


fun main(args: Array<String>){
	callSum()
}

fun callSum(){
	//declare variable use keyword val
	val a: Int = 2
	val b = 3 //Int type is inferred

	val c = sum(a,b)
	println("Result is $c")	
}

fun sum(a: Int,b: Int): Int{
	return a+b
}

//If as expression
fun maxOf(a: Int, b: Int) = if (a > b) a else b

//Nullable int maybe and cast implicit
fun getStringLenght(obj: Any): Int? {
	if(obj is String) {
		return obj.length
	}else{
		return null
	}		
}

fun loop(){
	val fruits = listOf("apple","banana","strawberry")
	for(index in fruits.indices){
		println("Item at $index is ${fruits[index]}")
	}
}
