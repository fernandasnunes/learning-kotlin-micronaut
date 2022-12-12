package com.integracaotwitter.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/integracaotwitter/controller/AnalyseTweetsController;", "", "analyzeTweets", "Lcom/integracaotwitter/service/interfaces/AnalyzeTweets;", "(Lcom/integracaotwitter/service/interfaces/AnalyzeTweets;)V", "analizeTweets", "Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;"})
@io.micronaut.http.annotation.Controller(value = "/analyze")
public final class AnalyseTweetsController {
    @jakarta.inject.Inject()
    private final com.integracaotwitter.service.interfaces.AnalyzeTweets analyzeTweets = null;
    
    public AnalyseTweetsController(@org.jetbrains.annotations.NotNull()
    com.integracaotwitter.service.interfaces.AnalyzeTweets analyzeTweets) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final com.integracaotwitter.service.nlu.dto.response.NluResponse analizeTweets() {
        return null;
    }
}