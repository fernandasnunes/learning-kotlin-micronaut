package com.integracaotwitter.service.nlu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/integracaotwitter/service/nlu/AnalyzeTweetsService;", "Lcom/integracaotwitter/service/interfaces/AnalyzeTweets;", "searchTwitter", "Lcom/integracaotwitter/service/interfaces/SearchTwitter;", "nluProvider", "Lcom/integracaotwitter/service/nlu/client/NluProvider;", "(Lcom/integracaotwitter/service/interfaces/SearchTwitter;Lcom/integracaotwitter/service/nlu/client/NluProvider;)V", "analyzeTweets", "Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;"})
@jakarta.inject.Singleton()
public final class AnalyzeTweetsService implements com.integracaotwitter.service.interfaces.AnalyzeTweets {
    private final com.integracaotwitter.service.interfaces.SearchTwitter searchTwitter = null;
    private final com.integracaotwitter.service.nlu.client.NluProvider nluProvider = null;
    
    public AnalyzeTweetsService(@org.jetbrains.annotations.NotNull()
    com.integracaotwitter.service.interfaces.SearchTwitter searchTwitter, @org.jetbrains.annotations.NotNull()
    com.integracaotwitter.service.nlu.client.NluProvider nluProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.integracaotwitter.service.nlu.dto.response.NluResponse analyzeTweets() {
        return null;
    }
}