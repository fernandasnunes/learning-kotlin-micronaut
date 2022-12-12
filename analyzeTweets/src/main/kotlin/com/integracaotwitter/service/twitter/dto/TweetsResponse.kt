package com.integracaotwitter.service.twitter.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class TweetsResponse(
    @JsonProperty("text")
    val text: String
)