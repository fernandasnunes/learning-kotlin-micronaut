package com.integracaotwitter.service.nlu.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0017R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/integracaotwitter/service/nlu/client/NluProvider;", "", "url", "", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "analyze", "", "analyzeTweets"})
@io.micronaut.http.client.annotation.Client()
public class NluProvider {
    private final java.lang.String url = null;
    private final java.lang.String path = null;
    
    public NluProvider(@org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Value(value = "${nlu.url}")
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Value(value = "${nlu.path}")
    java.lang.String path) {
        super();
    }
    
    @io.micronaut.http.annotation.Post()
    public void analyze() {
    }
}