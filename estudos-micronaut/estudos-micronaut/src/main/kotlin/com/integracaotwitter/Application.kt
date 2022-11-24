package com.integracaotwitter

import com.integracaotwitter.service.SearchTwitter
import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	SearchTwitter().sendTweet("hello")
	run(*args)
}


