package io.github.maa96.data.source.remote.dtos

import com.google.gson.annotations.SerializedName

data class ResponseWrapper<T : Any> (
    @SerializedName("data") val data: T,
    @SerializedName("data") val status: Status
)