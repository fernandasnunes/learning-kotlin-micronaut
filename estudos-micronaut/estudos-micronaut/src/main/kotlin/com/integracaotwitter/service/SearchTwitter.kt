package com.integracaotwitter.service

import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder

class SearchTwitter

{
    fun sendTweet(message: String){
        val apiKey =  ""
        val apiKeySecret = ""
        val accessToken=  ""
        val accessTokenSecret=  ""
        val configuration = ConfigurationBuilder()
        configuration.setOAuthConsumerKey(apiKey)
        configuration.setOAuthConsumerSecret(apiKeySecret)
        configuration.setOAuthAccessToken(accessToken)
        configuration.setOAuthAccessTokenSecret(accessTokenSecret)
        val twitter = TwitterFactory(configuration.build()).instance
        twitter.updateStatus(message)
    }
}