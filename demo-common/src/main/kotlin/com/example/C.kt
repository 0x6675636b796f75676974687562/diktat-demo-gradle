package com.example

object C {
    @JvmStatic
    fun main(vararg args: String) {
        println("java.version = ${System.getProperty("java.version")}")
    }
}
