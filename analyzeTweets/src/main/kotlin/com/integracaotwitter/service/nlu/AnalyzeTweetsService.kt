package com.integracaotwitter.service.nlu

import com.integracaotwitter.service.interfaces.AnalyzeTweets
import com.integracaotwitter.service.interfaces.SearchTwitter
import com.integracaotwitter.service.nlu.client.NluProvider
import com.integracaotwitter.service.nlu.dto.response.NluResponse
import com.integracaotwitter.service.nlu.mappers.NluRequestMapper
import io.github.cdimascio.dotenv.dotenv
import io.micronaut.http.BasicAuth
import jakarta.inject.Singleton
import java.nio.file.Paths

@Singleton
class AnalyzeTweetsService(private val searchTwitter: SearchTwitter, private val nluProvider: NluProvider) : AnalyzeTweets{
    override fun analyzeTweets(): NluResponse {
        val dotenv = dotenv {
            directory = Paths.get("").toAbsolutePath().toString() + "/src/main/assets"
            filename = "env"
        }
        val apiKeyNlu = dotenv["apiKeyNlu"]

        val tweetsResponse = searchTwitter.searchTweets()
        val text = NluRequestMapper().from(tweetsResponse)

        return nluProvider.analyze(nluRequest = text, "2019-07-12", BasicAuth("apikey", apiKeyNlu))

    }
}