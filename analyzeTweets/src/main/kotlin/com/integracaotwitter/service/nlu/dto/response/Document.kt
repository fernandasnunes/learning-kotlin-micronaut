package com.integracaotwitter.service.nlu.dto.response


import com.fasterxml.jackson.annotation.JsonProperty

data class Document(
    @JsonProperty("label")
    val label: String,
    @JsonProperty("score")
    val score: Double
)