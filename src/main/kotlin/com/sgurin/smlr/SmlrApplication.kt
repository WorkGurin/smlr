package com.sgurin.smlr

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SmlrApplication

fun main(args: Array<String>) {
    SpringApplication.run(SmlrApplication::class.java, *args)
}
