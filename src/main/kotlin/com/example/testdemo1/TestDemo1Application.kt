package com.example.testdemo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TestDemo1Application

fun main(args: Array<String>) {
    runApplication<TestDemo1Application>(*args)
}
