package com.integracaotwitter.service.nlu.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/integracaotwitter/service/nlu/client/NluProvider;", "", "analyze", "Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;", "version", "", "apiKey", "nluRequest", "Lcom/integracaotwitter/service/nlu/dto/request/NluRequest;", "analyzeTweets"})
@io.micronaut.http.annotation.Header(name = "Accept", value = "application/json")
@io.micronaut.http.client.annotation.Client(value = "${nlu.url}")
public abstract interface NluProvider {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "${nlu.path}")
    public abstract com.integracaotwitter.service.nlu.dto.response.NluResponse analyze(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Header(value = "Authorization")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.integracaotwitter.service.nlu.dto.request.NluRequest nluRequest);
}