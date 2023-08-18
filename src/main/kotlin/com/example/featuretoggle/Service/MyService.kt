package com.example.featuretoggle.Service

import io.getunleash.Unleash
import org.springframework.stereotype.Service


@Service
class MyService(unleash: Unleash) {
    private val unleash: Unleash

    init {
        this.unleash = unleash
    }

    val message: String
        get() = if (unleash.isEnabled("deneme")) {
            println("unleash.isEnabled()")
            println(unleash.isEnabled("deneme"))
            "New feature is enabled!"
        } else {
            println("unleash.isEnabled()")
            println(unleash.isEnabled("deneme"))
            "Old feature is being used."
        }
}