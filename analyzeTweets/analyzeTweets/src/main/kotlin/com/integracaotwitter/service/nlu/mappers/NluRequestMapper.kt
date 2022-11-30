package com.integracaotwitter.service.nlu.mappers

import com.integracaotwitter.service.nlu.dto.request.NluRequest
import com.integracaotwitter.service.twitter.dto.TweetsResponse

class NluRequestMapper {
    fun from(tweetsResponse: ArrayList<TweetsResponse>): NluRequest {
        return NluRequest(
            text = tweetsResponse[0].text, features = null
        )
    }
}