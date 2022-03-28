package com.example.demo_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoSpringApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringApplication>(*args)
}
//adasdasd
@RestController
class TestController {
    @RequestMapping("/")
    fun bestapi(): String {
        return "asdasdasd"
    }
}
