package com.integracaotwitter.controller

import com.integracaotwitter.service.interfaces.AnalyzeTweets
import com.integracaotwitter.service.interfaces.SearchTwitter
import com.integracaotwitter.service.nlu.dto.response.NluResponse
import com.integracaotwitter.service.twitter.dto.TweetsResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/analyze")
class AnalyseTweetsController(@Inject private val analyzeTweets: AnalyzeTweets) {


    @Get
    fun analizeTweets(): NluResponse {
        return analyzeTweets.analyzeTweets()
    }
}