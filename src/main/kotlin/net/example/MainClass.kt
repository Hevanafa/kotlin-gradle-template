package net.example

private class SubClass {
    init {
        println("SubClass constructor.")
    }
}

// driver class
class MainClass {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Hello from Kotlin!")

            SubClass()
        }
    }
}