package com.example.featuretoggle.Configuration

import io.getunleash.DefaultUnleash
import io.getunleash.Unleash
import io.getunleash.util.UnleashConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@ConfigurationProperties(prefix = "unleash")
class UnleashConfiguration {
    @Value("\${unleash.api-url}") private val apiUrl: String = ""
    @Value("\${unleash.app-name}") private val appName: String = ""
    @Value("\${unleash.api-token}") private val apiToken: String = ""

    // Getter and setter for appName and apiUrl
    @Bean
    fun unleash(): Unleash {

        val config = UnleashConfig.builder()
            .appName(appName)
            .instanceId(appName)
            .unleashAPI(apiUrl)
            .apiKey(apiToken)
            .build()

        return DefaultUnleash(config)
    }
}

