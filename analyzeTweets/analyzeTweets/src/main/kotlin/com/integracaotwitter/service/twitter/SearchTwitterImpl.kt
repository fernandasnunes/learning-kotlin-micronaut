package com.integracaotwitter.service.twitter
import io.github.cdimascio.dotenv.dotenv


import com.integracaotwitter.service.interfaces.SearchTwitter
import io.micronaut.context.annotation.Value
import jakarta.inject.Singleton
import twitter4j.Query
import twitter4j.QueryResult
import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder
import java.nio.file.Paths

@Singleton
class SearchTwitterImpl(
) : SearchTwitter {

    override fun searchTweets(): List<Any> {
        val dotenv = dotenv {
            directory = Paths.get("").toAbsolutePath().toString()+"/src/main/assets"
            filename = "env"
        }
        val apiKeyTwitter = dotenv["apiKeyTwitter"]
        val apiKeySecretTwitter = dotenv["apiKeySecretTwitter"]


        val configuration = ConfigurationBuilder()
        configuration.setApplicationOnlyAuthEnabled(true)

        val twitter = TwitterFactory(configuration.build()).instance
        twitter.setOAuthConsumer(apiKeyTwitter, apiKeySecretTwitter)
        twitter.oAuth2Token.accessToken
        val query = Query("copa")
        val result: QueryResult = twitter.search(query)
        return result.tweets
    }

}