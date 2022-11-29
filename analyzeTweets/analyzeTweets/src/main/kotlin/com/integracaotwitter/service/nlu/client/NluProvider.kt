package com.integracaotwitter.service.nlu.client

import com.integracaotwitter.service.nlu.dto.request.NluRequest
import com.integracaotwitter.service.nlu.dto.response.NluResponse
import io.micronaut.context.annotation.Value
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.reactivex.rxjava3.core.Single
import java.net.http.HttpResponse

@Client
class NluProvider(
    @Value("\${nlu.url}")
    private val url: String,
    @Value("\${nlu.path}")
    private val path: String,

) {
    @Post
    fun analyze() {
    }

}