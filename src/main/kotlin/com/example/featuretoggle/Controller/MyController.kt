package com.example.featuretoggle.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MyController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Merhaba, dünya!"
    }

    @GetMapping("/greet/{name}")
    fun greet(@PathVariable name: String): String {
        return "Merhaba, $name!"
    }
}
