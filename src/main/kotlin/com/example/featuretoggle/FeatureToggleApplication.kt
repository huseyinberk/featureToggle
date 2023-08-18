package com.example.featuretoggle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeatureToggleApplication

fun main(args: Array<String>) {
    runApplication<FeatureToggleApplication>(*args)
}
