package ru.kk.tst

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TstApplication

fun main(args: Array<String>) {
    SpringApplication.run(TstApplication::class.java, *args)
}
