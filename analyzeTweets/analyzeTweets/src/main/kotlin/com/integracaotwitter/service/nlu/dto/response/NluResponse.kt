package com.integracaotwitter.service.nlu.dto.response


import com.fasterxml.jackson.annotation.JsonProperty

data class NluResponse(
    @JsonProperty("categories")
    val categories: List<Category>,
    @JsonProperty("language")
    val language: String,
    @JsonProperty("sentiment")
    val sentiment: Sentiment,
    @JsonProperty("usage")
    val usage: Usage
)