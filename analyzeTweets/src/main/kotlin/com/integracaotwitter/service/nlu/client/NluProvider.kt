package com.integracaotwitter.service.nlu.client

import com.integracaotwitter.service.nlu.dto.request.NluRequest
import com.integracaotwitter.service.nlu.dto.response.NluResponse
import io.micronaut.http.HttpHeaders.ACCEPT
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client

@Client("\${nlu.url}")
@Header(name = ACCEPT, value = "application/json")
interface NluProvider {
    @Post("\${nlu.path}")
    fun analyze(
        @PathVariable version: String,
        @Header(io.micronaut.http.HttpHeaders.AUTHORIZATION) apiKey: String,
        @Body nluRequest: NluRequest
    ): NluResponse
}

