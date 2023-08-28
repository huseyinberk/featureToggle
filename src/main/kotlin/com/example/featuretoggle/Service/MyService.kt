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
        get() = if (unleash.isEnabled("example")) {
            "New feature is enabled!"
        } else {
            "Old feature is being used."
        }
}