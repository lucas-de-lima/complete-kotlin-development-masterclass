package org.lucasdelima.lesson03

fun main() {
    sendMessage("Hello, Lucas! Whats up?", "Lucas")
}

fun sendMessage(msg: String, person: String) {
    println("Sending Message to: $person")
    println("Message: $msg")
}