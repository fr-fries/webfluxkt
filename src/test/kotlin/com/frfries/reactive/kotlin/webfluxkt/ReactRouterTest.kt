package com.frfries.reactive.kotlin.webfluxkt

import org.junit.jupiter.api.Test
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody

class ReactRouterTest {

    var handler = ReactHandler()
    private val client = WebTestClient.bindToRouterFunction(ReactRouter(handler).routes()).build()

    @Test
    fun routesHelloTest() {
        client.get().uri("/hello")
                .exchange()
                .expectStatus().isOk
                .expectBody<String>()
                .isEqualTo("Hello, Spring!")
    }

    @Test
    fun routesHealthTest() {
        client.get().uri("/health")
                .exchange()
                .expectStatus().isOk
                .expectBody<String>()
                .isEqualTo("Server is Live")
    }
}