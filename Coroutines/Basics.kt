import kotlinx.coroutines.*

fun main(args: Array<String>) {
    GlobalScope.launch{ //Launch a new corountine and continue
        delay(1000L)//Delay 1 second
        println("World!")//Print after delay
    }

    println("Hello ")//Main thread continues while corountine is delayed
    Thread.sleep(2000L)// block main thread for 2 seconds to keep JVM alive
}