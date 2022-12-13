package com.integracaotwitter.service.nlu.dto.response


import com.fasterxml.jackson.annotation.JsonProperty

data class Usage(
    @JsonProperty("features")
    val features: Int,
    @JsonProperty("text_characters")
    val textCharacters: Int,
    @JsonProperty("text_units")
    val textUnits: Int
)