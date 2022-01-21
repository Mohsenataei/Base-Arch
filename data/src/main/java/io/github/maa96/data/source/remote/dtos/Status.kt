package io.github.maa96.data.source.remote.dtos

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("timestamp") val generatedTime: String,
    @SerializedName("error_code") val errorCode: Int,
    @SerializedName("error_message") val errorMessage: Int
)
