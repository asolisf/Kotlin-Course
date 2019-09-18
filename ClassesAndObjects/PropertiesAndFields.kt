package com.alansolisflores.main

fun main(args: Array<String>) {
    val address = Address()
    println(address.isZipEmpty)
    address.Zip = 55040
    println(address.isZipEmpty)
    println(address.Zip) 
}

class Address{
    private var name: String = "Holmes, Sherlock"
    private var street: String = "Baker"
    private var city: String = "London"
    private var state: String? = null
    
    private var zip: Int = 0

    var isZipEmpty: Boolean = (this.zip == 0)
        get() = this.zip == 0

    var Zip: Int
        get() = this.zip
        set(value){
            this.zip = value
        }

}