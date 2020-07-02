package com.frfries.reactive.kotlin.webfluxkt

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class ReactRouter(val handler: ReactHandler) {

    @Bean
    fun routes() = router {
        listOf(
                GET("/hello", handler::hello),
                GET("/health", handler::health)
        )
    }
}
