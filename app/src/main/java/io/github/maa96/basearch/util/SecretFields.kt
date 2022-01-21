package io.github.maa96.basearch.util

import com.mohsen.architecture.BuildConfig
import javax.inject.Inject

/**
 * Helper class to save and get secret data using NDK
 */
class SecretFields @Inject constructor() {

    private val debugBaseUrl = "https://newsapi.org/v2/"

    private val releaseBaseUrl = "https://newsapi.org/v2/"

    val apiKey: String = "a51cefac233347d894f86ac05fb6c647"

    fun getBaseUrl(): String {
        return if (BuildConfig.DEBUG) {
            debugBaseUrl
        } else {
            releaseBaseUrl
        }
    }
}