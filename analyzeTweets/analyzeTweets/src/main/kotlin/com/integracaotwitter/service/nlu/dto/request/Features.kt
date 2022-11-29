package com.integracaotwitter.service.nlu.dto.request


import com.fasterxml.jackson.annotation.JsonProperty

data class Features(
    @JsonProperty("categories")
    val categories: Categories,
    @JsonProperty("sentiment")
    val sentiment: Sentiment
)