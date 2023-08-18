package com.example.featuretoggle.Controller

import com.example.featuretoggle.Service.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MyController(private val myService: MyService) {

    @GetMapping("/hello")
    fun hello(): String {
        return myService.message
    }

    @GetMapping("/greet/{name}")
    fun greet(@PathVariable name: String): String {
        return "Merhaba, $name!"
    }
}
