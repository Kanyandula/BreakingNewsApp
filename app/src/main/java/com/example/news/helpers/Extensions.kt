package com.example.news.helpers

import com.example.news.models.Article
import kotlinx.coroutines.*


fun <T> lazyDeferred(block: suspend CoroutineScope.() -> T): Lazy<Unit> {
    return lazy {
        GlobalScope.async(start = CoroutineStart.LAZY) {
            block.invoke(this)
        }
    }
}

fun getSeparatedString(){






}