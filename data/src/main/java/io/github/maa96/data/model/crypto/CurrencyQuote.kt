package io.github.maa96.data.model.crypto

import com.google.gson.annotations.SerializedName

data class CurrencyQuote(
    @SerializedName("price") val price: Double,
    @SerializedName("percent_change_1h") val percentChange1h: Double,
    @SerializedName("percent_change_24h") val percentChange24h: Double,
    @SerializedName("percent_change_7d") val percentChange7d: Double,
    @SerializedName("last_updated") val lastUpdated: String
)
