package io.github.maa96.data.source.remote

import com.google.gson.Gson
import com.google.gson.JsonParseException
import io.github.maa96.data.model.crypto.CryptoCurrency
import io.github.maa96.data.source.local.file.BaseFileProvider
import io.github.maa96.data.source.remote.dtos.ResponseWrapper
import io.github.maa96.data.util.fromJson

/**
 * Stub implementation of [DataSource].
 *
 * <b>CAUTION : this implementation should be used only in debug mode</b>
 */
class StubDataSource(
    private val gson: Gson,
    private val fileProvider: BaseFileProvider
) : DataSource {

    override suspend fun getLatestUpdates(
        start: Int,
        limit: Int,
        convertTo: String
    ): ResponseWrapper<List<CryptoCurrency>> {
        val inputStream = fileProvider.getAsset("latest_updates.json")
        val response = String(fileProvider.getByteArrayFromInputStream(inputStream))
        return gson.fromJson(response) ?: throw JsonParseException("provided json file is not ")
    }
}
