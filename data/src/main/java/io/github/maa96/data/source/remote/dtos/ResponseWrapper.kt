package io.github.maa96.data.source.remote.dtos

import com.google.gson.annotations.SerializedName

data class ResponseWrapper<T : Any> (
    @SerializedName("data") val status: String,
    @SerializedName("total_results") val totalResults: Int,
    @SerializedName("articles") val articles: T
)