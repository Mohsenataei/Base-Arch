package io.github.maa96.data.source.remote

import io.github.maa96.data.model.Article
import io.github.maa96.data.source.remote.dtos.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface DataSource {
    @GET("top-headlines")
    suspend fun getTechCrunchNews(
        @Query("sources") sources: String = "techcrunch"
    ): ResponseWrapper<List<Article>>
}
