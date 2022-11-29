package com.integracaotwitter.service.nlu.dto.request


import com.fasterxml.jackson.annotation.JsonProperty

data class NluRequest(
    @JsonProperty("features")
    val features: Features,
    @JsonProperty("text")
    val text: String
)