package com.integracaotwitter.service.nlu.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/integracaotwitter/service/nlu/client/NluProvider;", "", "analyze", "Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;", "nluRequest", "Lcom/integracaotwitter/service/nlu/dto/request/NluRequest;", "version", "", "basicAuth", "Lio/micronaut/http/BasicAuth;", "analyzeTweets"})
@io.micronaut.http.annotation.Header(name = "Accept", value = "application/json")
@io.micronaut.http.client.annotation.Client(value = "${nlu.url}")
public abstract interface NluProvider {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Consumes(value = {"application/json"})
    @io.micronaut.http.annotation.Post(value = "${nlu.path}")
    public abstract com.integracaotwitter.service.nlu.dto.response.NluResponse analyze(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.integracaotwitter.service.nlu.dto.request.NluRequest nluRequest, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    @io.micronaut.http.annotation.Header(name = "Accept", value = "application/json")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    io.micronaut.http.BasicAuth basicAuth);
}