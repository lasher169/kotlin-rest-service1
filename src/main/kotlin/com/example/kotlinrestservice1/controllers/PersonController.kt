package com.example.kotlinrestservice1.controllers

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class PersonController {

        @GetMapping("/")
        fun blog() = "This is a piece of text"




        @GetMapping("/id")
        fun getPlayers() = "Greetings from Kotlin";

//        @PostMapping("/addCustomer")
//        fun insertPerson(person : Person) : Person {
//                val newPerson = Person(person.firtName, person.lastName, person.address1, person.suburb);
//
//                return newPerson.save();
//        }
}