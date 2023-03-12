package com.example.kotlinrestservice1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
//@ComponentScan(basePackages = ["com.example.controllers"])
class KotlinRestService1Application

fun main(args: Array<String>) {
    runApplication<KotlinRestService1Application>(*args)
}
