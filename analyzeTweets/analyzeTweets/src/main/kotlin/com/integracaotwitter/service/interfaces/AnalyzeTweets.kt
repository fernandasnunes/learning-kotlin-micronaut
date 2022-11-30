package com.integracaotwitter.service.interfaces

import com.integracaotwitter.service.nlu.dto.response.NluResponse

interface AnalyzeTweets {

    fun analyzeTweets(): NluResponse
}