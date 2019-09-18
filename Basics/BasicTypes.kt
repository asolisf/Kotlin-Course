package com.alansolisflores.main

fun main(args: Array<String>){
	variablesTypes()
	nullableVar()
	conversions()
	array()
}

fun variablesTypes(){
	val one = 1 //Int
	val threeBillion = 3000000000 //Long
	val oneLong = 1L //Long
	val oneByte: Byte = 1
	val pi = 3.14 //Double
	val e = 2.718281824 //Double
	val eFloat = 2.718281824 //Float

	//You can use underscores to make number constants more redeable
	val oneMillion = 1_000_000
	val creditCardNumber = 1234_5678_9012_3456L
	val socialSecurityNumber = 999_99_9999L
	val hexBytes = 0xFF_EC_DE_5E
	val bytes = 0b11010010_01101001_10010100_10010010
}

fun nullableVar(){
	val a: Int = 10000
	println(a == a) // Prints 'true'
	val boxedA: Int? = a
	val anotherBoxedA: Int? = a
	println(boxedA == anotherBoxedA) // Prints 'true'
	println(boxedA === anotherBoxedA) // Prints 'false'
}

/*
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
 */
fun conversions(){
	val a: Long = 1
	val b: Int = a.toInt()
	println(b)
}

fun array(){
	//print array with length 5 [0,1,4,9,16]
	var asc = Array(5) { i -> (i*i).toString() }
	asc.forEach{println(it)}
}


