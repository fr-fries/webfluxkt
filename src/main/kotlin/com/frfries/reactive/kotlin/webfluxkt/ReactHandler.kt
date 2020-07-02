package com.frfries.reactive.kotlin.webfluxkt

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Component
class ReactHandler {

    fun hello(request: ServerRequest): Mono<ServerResponse> =
        ok().body(fromValue("Hello, Spring!")).toMono()

    fun health(request: ServerRequest): Mono<ServerResponse> =
        ok().body(fromValue("Server is Live")).toMono()
}