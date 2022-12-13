package com.integracaotwitter.service.interfaces

import com.integracaotwitter.service.twitter.dto.TweetsResponse

interface SearchTwitter {

    fun searchTweets(): ArrayList<TweetsResponse>
}