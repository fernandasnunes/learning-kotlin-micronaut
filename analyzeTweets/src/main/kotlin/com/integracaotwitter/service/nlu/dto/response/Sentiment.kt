package com.integracaotwitter.service.nlu.dto.response


import com.fasterxml.jackson.annotation.JsonProperty

data class Sentiment(
    @JsonProperty("document")
    val document: Document
)