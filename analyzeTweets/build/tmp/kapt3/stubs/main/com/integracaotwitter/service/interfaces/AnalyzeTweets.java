package com.integracaotwitter.service.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0002"}, d2 = {"Lcom/integracaotwitter/service/interfaces/AnalyzeTweets;", "", "analyzeTweets", "Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;"})
public abstract interface AnalyzeTweets {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.integracaotwitter.service.nlu.dto.response.NluResponse analyzeTweets();
}