package com.integracaotwitter.service.nlu.dto.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/integracaotwitter/service/nlu/dto/response/NluResponse;", "", "categories", "", "Lcom/integracaotwitter/service/nlu/dto/response/Category;", "language", "", "sentiment", "Lcom/integracaotwitter/service/nlu/dto/response/Sentiment;", "usage", "Lcom/integracaotwitter/service/nlu/dto/response/Usage;", "(Ljava/util/List;Ljava/lang/String;Lcom/integracaotwitter/service/nlu/dto/response/Sentiment;Lcom/integracaotwitter/service/nlu/dto/response/Usage;)V", "getCategories", "()Ljava/util/List;", "getLanguage", "()Ljava/lang/String;", "getSentiment", "()Lcom/integracaotwitter/service/nlu/dto/response/Sentiment;", "getUsage", "()Lcom/integracaotwitter/service/nlu/dto/response/Usage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "analyzeTweets"})
public final class NluResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.integracaotwitter.service.nlu.dto.response.Category> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    private final com.integracaotwitter.service.nlu.dto.response.Sentiment sentiment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.integracaotwitter.service.nlu.dto.response.Usage usage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.integracaotwitter.service.nlu.dto.response.NluResponse copy(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "categories")
    java.util.List<com.integracaotwitter.service.nlu.dto.response.Category> categories, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sentiment")
    com.integracaotwitter.service.nlu.dto.response.Sentiment sentiment, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "usage")
    com.integracaotwitter.service.nlu.dto.response.Usage usage) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NluResponse(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "categories")
    java.util.List<com.integracaotwitter.service.nlu.dto.response.Category> categories, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sentiment")
    com.integracaotwitter.service.nlu.dto.response.Sentiment sentiment, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "usage")
    com.integracaotwitter.service.nlu.dto.response.Usage usage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.integracaotwitter.service.nlu.dto.response.Category> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.integracaotwitter.service.nlu.dto.response.Category> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.integracaotwitter.service.nlu.dto.response.Sentiment component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.integracaotwitter.service.nlu.dto.response.Sentiment getSentiment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.integracaotwitter.service.nlu.dto.response.Usage component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.integracaotwitter.service.nlu.dto.response.Usage getUsage() {
        return null;
    }
}