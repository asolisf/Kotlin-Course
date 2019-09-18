package com.alansolisflores

import kotlin.reflect.KProperty
import kotlin.properties.Delegates

fun main(args: Array<String>) {
    val foo = Foo()
    foo.p = "Paragraph"
    print(foo.p)

    val doo = Doo()
    doo.p = "Do"
    doo.p = "Doing"
}

class Foo {
    var p: String by Delegate()
}

//Listeners
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{
        return "$thisRef, delegating ${property.name}!\n"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("$value has been assigned  to ${property.name} in $thisRef.")
    }
}

class Doo {
    var p: String by Delegates.observable("empty"){
        prop, old, new -> 
            println("$old -> $new")        
    }
}