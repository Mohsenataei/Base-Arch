package io.github.maa96.data.source.remote

import arrow.core.Either
import io.github.maa96.data.model.Error
import io.github.maa96.data.model.crypto.CryptoCurrency
import io.github.maa96.data.source.remote.dtos.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface DataSource {
    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getLatestUpdates(
        @Query("start") start: Int,
        @Query("limit") limit: Int,
        @Query("convert") convertTo: String
    ): ResponseWrapper<List<CryptoCurrency>>
}