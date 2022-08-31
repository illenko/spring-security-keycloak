package com.illenko.resource

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
class ResourceApplication

fun main(args: Array<String>) {
    runApplication<ResourceApplication>(*args)
}