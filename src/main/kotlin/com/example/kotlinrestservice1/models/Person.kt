package com.example.kotlinrestservice1.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Getter
import lombok.Setter


@Entity
@Table(name = "person")
data class Person(

    @Getter
    @Setter
    @Column(nullable = false)
    val firtName: String,

    @Getter
    @Setter
    @Column(nullable = false)
    val lastName: String,

    @Getter
    @Setter
    @Column(nullable = false)
    val address1: String,

    @Getter
    @Setter
    @Column(nullable = false)
    val suburb: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val customerId: Int?=null,
)
