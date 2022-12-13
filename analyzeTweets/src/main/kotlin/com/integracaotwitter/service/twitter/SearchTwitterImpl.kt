package com.integracaotwitter.service.twitter


import com.integracaotwitter.service.interfaces.SearchTwitter
import com.integracaotwitter.service.twitter.dto.TweetsResponse
import com.integracaotwitter.service.twitter.mappers.TweetsResponseMapper
import io.github.cdimascio.dotenv.dotenv
import jakarta.inject.Singleton
import twitter4j.Query
import twitter4j.QueryResult
import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder
import java.nio.file.Paths

@Singleton
class SearchTwitterImpl(

) : SearchTwitter {

    override fun searchTweets(): ArrayList<TweetsResponse> {
        val listTweets: ArrayList<TweetsResponse> = arrayListOf()

        val dotenv = dotenv {
            directory = Paths.get("").toAbsolutePath().toString() + "/src/main/assets"
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
        val tweets = result.tweets
        for (text in tweets) {
            listTweets.add(TweetsResponseMapper().from(text = text.text))
        }
        return listTweets
    }

}