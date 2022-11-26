package com.integracaotwitter.service.twitter

import com.integracaotwitter.service.interfaces.SearchTwitter
import io.micronaut.context.annotation.Value
import jakarta.inject.Singleton
import twitter4j.Query
import twitter4j.QueryResult
import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder

@Singleton
class SearchTwitterImpl(
    @Value("\${twitter.apiKey}")
    private val apiKey: String,
    @Value("\${twitter.apiKeySecret}")
    private val apiKeySecret: String,
) : SearchTwitter {
    override fun searchTweets(): List<Any> {

        val configuration = ConfigurationBuilder()
        configuration.setApplicationOnlyAuthEnabled(true)

        val twitter = TwitterFactory(configuration.build()).getInstance()
        twitter.setOAuthConsumer(apiKey, apiKeySecret)
        twitter.oAuth2Token.accessToken
        val query = Query("copa")
        val result: QueryResult = twitter.search(query)
        return result.tweets
    }

}