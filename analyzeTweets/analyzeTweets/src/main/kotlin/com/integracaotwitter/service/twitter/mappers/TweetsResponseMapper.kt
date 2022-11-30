package com.integracaotwitter.service.twitter.mappers

import com.integracaotwitter.service.twitter.dto.TweetsResponse

class TweetsResponseMapper {
    fun from(text: String): TweetsResponse {
        return TweetsResponse(
            text = text
        )
    }
}