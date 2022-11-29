package com.integracaotwitter.controller

import com.integracaotwitter.service.interfaces.SearchTwitter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/analyze")
 class AnalyseTweetsController(@Inject private val searchTwitter: SearchTwitter) {


    @Get
    fun analizeTweets(): List<Any> {
        return searchTwitter.searchTweets()
    }
}