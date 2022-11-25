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
    @Value("\${apiKey}")
    private val apiKey: String,
    @Value("\${apiKeySecret}")
    private val apiKeySecret: String,
    @Value("\${accessToken}")
    private val accessToken: String,
    @Value("\${accessTokenSecret}")
    private val accessTokenSecret: String
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