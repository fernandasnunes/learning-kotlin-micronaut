package com.integracaotwitter.service.nlu.client

import com.integracaotwitter.service.nlu.dto.request.NluRequest
import com.integracaotwitter.service.nlu.dto.response.NluResponse
import io.micronaut.http.BasicAuth
import io.micronaut.http.HttpHeaders.ACCEPT
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client("\${nlu.url}")
@Header(name = ACCEPT, value = "application/json")
interface NluProvider {
    @Post("\${nlu.path}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun analyze(
        @Header(name = ACCEPT, value = "application/json")
        @QueryValue version: String,
        basicAuth: BasicAuth,
        @Body nluRequest: NluRequest
    ): NluResponse
}

